public class School {
    private double[] latlong; // latitude, longitude 
    private String[] info; 

    // Set the index value for different info: 
    // name/address/type/phone (type refers to elementary, middle, etc.)
    // 
    // This scheme works because School 
    // is only constructed by one class,
    // which knows exactly what order 
    // to put info in.
    //
    // If we wanted to be more general,
    // we would parse column names from
    // the school_data.csv file, and allow
    // the user to pass a column name to get 
    // values. For example,
    //
    // School s = new School("Chief Sealth");
    // String s_address = s.get('address');
    // 
    private int name_ix  = 0;
    private int type_ix  = 1;
    private int addr_ix  = 2;
    private int phone_ix = 3;

    public School(double[] latlong, String[] info) {
        // Constructor for schools takes an array of lat/long values,
        // and a String array of name/type/address/phone.
        // 
        // We could unpack all of this, but why bother?
        // Do nothing for as long as possible!
        this.latlong = latlong;
        this.info = info;
    }

    public String getName() { 
        return this.info[name_ix];
    }
    public String getType() { 
        return this.info[type_ix];
    }
    public String getAddress() { 
        return this.info[addr_ix];
    }
    public String getPhone() { 
        return this.info[phone_ix];
    }
    public double[] getCoords() { 
        return this.latlong;
    }
    public double getDistance(School other_school) { 
        double[] other_coords = other_school.getCoords();
        double[] this_coords = this.getCoords();

        // We will call the code written by 
        // Reges & Stepp directly.
        // This ZipLookup.java class is available
        // on the authors' website and is also
        // printed in the book.
        //
        // IF YOU USE SOMEONE ELSE'S CODE, 
        // YOU NEED TO CITE THE PUBLICATION
        // OR LINK, AND INCLUDE THE ORIGINAL
        // AUTHOR'S NAME.
        //
        // SIMPLY COPYING AND PASTING SOMEONE 
        // ELSE'S CODE AND CLAIMING IT IS YOUR OWN
        // BY PUTTING YOUR NAME ON IT IS PLAGIARISM.
        //
        return ZipLookup.distance(this_coords[0],this_coords[1],
                                  other_coords[0],other_coords[1]);
    }
    public String toString() {
        return this.getName();
    }
}
