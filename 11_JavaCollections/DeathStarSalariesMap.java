import java.util.*;
public class DeathStarSalariesMap {
    public static void main(String[] args) { 
        Map<String, Double> salaryMap = new HashMap<String, Double>();
        salaryMap.put("Emperor Palpatine",      500.0);
        salaryMap.put("Darth Vader",            250.0);
        salaryMap.put("Death Star Gunner No. 5", 15.0);
        salaryMap.put("Stormtrooper TK421",      10.0);

        System.out.println("8 AM");
        System.out.println("Death Star HR Department Salary Report:");
        printMap(salaryMap);

        // stormtrooper found asleep on the job
        salaryMap.remove("Stormtrooper TK421");

        System.out.println("9 AM");
        System.out.println("Death Star HR Department Salary Report:");
        printMap(salaryMap);

    }

    public static void printMap(Map<String,Double> m) {
        Set<String> keys = m.keySet(); 
        Iterator<String> iter = keys.iterator();
        while(iter.hasNext()) {
            String k = iter.next();
            System.out.println( "  " + k + " : " + m.get(k) );
        }
        System.out.println();
    }
}
