import java.util.*; 
import java.io.*;

public class Driver {

    public static void main(String[] args) throws FileNotFoundException { 
        SSD s = new SSD("school_data.csv");
        //problem1(s);
        //problem2(s);
        //problem3(s);
        problem4(s);
    }

    /** Problem 1: Print schools and phone numbers, in order of descending phone number. */
    public static void problem1(SSD school_data) throws FileNotFoundException { 

        // Get the phone book, and reverse it
        TreeMap<String,String> phone = school_data.getPhoneBook();
        TreeMap<String,String> reverse_phone = MapOperations.reverseMap(phone);

        // Print it out
        for( String ph : reverse_phone.keySet() ) {
            String sch = reverse_phone.get(ph);
            if(!ph.isEmpty()) {
                System.out.println(sch + "\t\t\t" + ph); 
            }
        }
    }

    /** Problem 2: Print 5 schools closest to Chief Sealth High School. */ 
    public static void problem2(SSD school_data) throws FileNotFoundException { 

        // Get the distance map, and reverse it
        TreeMap<String,Double> sealth = school_data.getDistanceMap("Chief Sealth");
        TreeMap<Double,String> reverse_sealth = MapOperations.reverseDistanceMap(sealth);

        // Print the first 5 schools in the reversed list 
        int i=0;
        for( Double d : reverse_sealth.keySet() ) {
            String sch = reverse_sealth.get(d);
            System.out.println(sch + " : " + d);
            i++;
            if(i>5) { 
                break;
            }
        }
    }

    /** Problem 3: What school is located on 28th Ave NW */ 
    public static void problem3(SSD school_data) throws FileNotFoundException { 
        String target = "28th Ave NW";
        TreeMap<String,String> addressBook = school_data.getAddressBook();
        String the_right_school = "";
        for( String sch : addressBook.keySet() ) {
            String addr = addressBook.get(sch);
            if( addr.contains(target) ) { 
                the_right_school = sch;
            }
        }
        if( the_right_school.isEmpty() ) {
            System.out.println("Could not find a school located on "+target);
        } else {
            System.out.println(the_right_school + " is located on " + target);
        }
    }

    /** Problem 4: What two schools are the furthest distance apart from each other? How far apart? */ 
    public static void problem4(SSD school_data) throws FileNotFoundException { 
        // Use a cumulative algorithm.
        // Store the (current) two furthest schools in furthest_apart, and their distance in furthest_distance.
        String[] furthest_apart = new String[2];
        double furthest_distance = 0.0;

        for( String sch : school_data.getSchoolsList() ) {

            // Store the distance map and the reversed distance map
            TreeMap<String,Double> distance_map = school_data.getDistanceMap(sch);
            TreeMap<Double,String> reverse_distance_map = MapOperations.reverseDistanceMap(distance_map);

            // Get the furthest distance
            for(Double d : reverse_distance_map.keySet() ) { 
                if(d > furthest_distance) { 
                    furthest_distance = d;
                    furthest_apart[0] = sch;
                    furthest_apart[1] = reverse_distance_map.get(d);
                }
            }
        }

        System.out.println(furthest_apart[0] + " and " + furthest_apart[1] + " are " + furthest_distance);
    }

}
