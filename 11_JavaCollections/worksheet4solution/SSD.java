import java.util.*; 
import java.io.*;

public class SSD {

    private String filename;
    private boolean isLoaded;
    private TreeMap<String,School> allSchools;
    private TreeMap<String,String> addressBook;
    private TreeMap<String,String> phoneBook;

    /** Constructor: takes the filename of the file containing the public schools data */
    public SSD(String filename) {
        this.filename = filename;
        isLoaded = false;
    }
    
    /** Load the data into memory (once). 
     * No one can do this except this class. */
    private void loadData() throws FileNotFoundException {
        if(!this.isLoaded) { 

            // ArrayList of School objects - a handy wrapper class for public school data
            allSchools = new TreeMap<String,School>();

            try{ 
                // the public school data file
                Scanner schooldata = new Scanner( new File(this.filename) );

                // skip the headers - we will hard code column index values
                String headers = schooldata.nextLine();

                // Load each school
                int lc = 0;
                while( schooldata.hasNextLine() ) {
                    String line = schooldata.nextLine();
                    lc++;
                    //// debug output
                    //System.out.printf("Loaded school %d \n",lc);
                    // parseLine method parses the line and returns a School object
                    School s = parseLine(line);
                    allSchools.put( s.getName(), s );
                }

                // Done loading the data
                this.isLoaded = true;

            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }

        }
    }

    /** Chop up a line and feed the pieces to School constructor.
     * No one can do this except this class. 
     * If the data file format changes, 
     * this is where you fix the code. */
    private School parseLine( String line ) { 

        String[] linetokens = line.split(",");

        // Note that we have to hard-code some things
        // particular to this data file.
        //
        // If we modify the data file format,
        // we only need to modify how each line in the data file 
        // is being parsed to update how data is loaded.
        int lat_ix   =  1;
        int long_ix  =  2;
        int name_ix  = 11;
        int type_ix  =  5;
        int addr_ix  =  6;
        int phone_ix =  9;

        double[] latlong = new double[2];
        String[] info = new String[4];

        // convert String to double using Double.parseDouble( "0.0001" )
        latlong[0] = Double.parseDouble( linetokens[lat_ix]  );
        latlong[1] = Double.parseDouble( linetokens[long_ix] );

        info[0] = linetokens[name_ix];
        info[1] = linetokens[type_ix];
        info[2] = linetokens[addr_ix];
        info[3] = linetokens[phone_ix];

        School s = new School(latlong,info);
        return s;
    }

    /** Compute the distance from school this_school to every other school in the public schools data set.
     *  Store it in a map - key is name of other school, value is double distance.
     *  We don't save these - not worth the memory. */
    public TreeMap<String,Double> getDistanceMap(String this_school_name) throws FileNotFoundException { 
        loadData();

        // Allow for fuzzy search
        String this_school_key = "";
        for( String key : allSchools.keySet() ) {
            if(key.contains(this_school_name)) {
                this_school_key = key;
            }
        }
        if(this_school_key.isEmpty()) {
            System.out.println("Could not find specified school.");
            return new TreeMap<String,Double>();
        }

        // Map to store distances:
        TreeMap<String,Double> distances = new TreeMap<String,Double>();

        // Finding distance from this_school to all other schools
        School this_school = allSchools.get(this_school_key);
        for( School other_school : allSchools.values() ) { 
            String other_school_key = other_school.getName();
            if(other_school_key.equals(this_school_key)) { 
                // skip self
                continue;
            }
            double distance = this_school.getDistance( other_school );
            distances.put( other_school_key, distance );
        }
        return distances;
    }

    /** Return a list of all schools */
    public Set<String> getSchoolsList() throws FileNotFoundException { 
        loadData();
        return allSchools.keySet();
    }

    /** Return the phone book (map of school names to phone numbers). We do save this map, since there's only one. */ 
    public TreeMap<String,String> getPhoneBook() throws FileNotFoundException {
        loadData();
        this.phoneBook = new TreeMap<String,String>();
        for( School s : allSchools.values() ) {
            String key = s.getName();
            String value = s.getPhone();
            this.phoneBook.put(key,value);
        }
        return this.phoneBook;
    }

    /** Return the address book (map of school names to addresses). We do save this map, since there's only one. */
    public TreeMap<String,String> getAddressBook() throws FileNotFoundException {
        loadData();
        this.addressBook = new TreeMap<String,String>();
        for( School s : allSchools.values() ) { 
            String key = s.getName();
            String value = s.getAddress();
            this.addressBook.put(key,value);
        }
        return this.addressBook;
    }
}
