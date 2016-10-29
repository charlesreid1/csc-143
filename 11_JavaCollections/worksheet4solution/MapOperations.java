import java.util.*;

public class MapOperations { 

    public static TreeMap<String, String> reverseMap( TreeMap<String, String> forward ) {
        TreeMap<String,String> reverse = new TreeMap<String,String>();
        for( String key : forward.keySet() ) {
            String value = forward.get(key);
            reverse.put(value,key);
        }
        return reverse;
    }

    public static TreeMap<Double, String> reverseDistanceMap( TreeMap<String, Double> forward ) {
        TreeMap<Double,String> reverse = new TreeMap<Double,String>();
        for( String key : forward.keySet() ) {
            Double value = forward.get(key);
            reverse.put(value,key);
        }
        return reverse;
    }

}
