import java.util.*;

public class StoogesSet {
    public static void main(String[] args){ 
        Set<String> stooges = new HashSet<String>();

        stooges.add("Larry");
        stooges.add("Moe");
        stooges.add("Curly");
        stooges.add("Moe");
        stooges.add("Congress");
        stooges.add("Moe");

        System.out.println("Here are all the stooges:");
        Iterator<String> itr = stooges.iterator();
        while( itr.hasNext() ) {
            String name = itr.next();
            System.out.println(" - " + name);
        }
    }
}
