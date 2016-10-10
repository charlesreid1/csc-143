import java.util.*;

public class ListSearch {
    public static void main(String[] args) { 
        ArrayList<String> sentence = new ArrayList<String>();
        sentence.add("This");
        sentence.add("is");
        sentence.add("not");
        sentence.add("a");
        sentence.add("sentence");
        System.out.println("Before:");
        System.out.println(sentence);
        int i = sentence.indexOf("not");
        sentence.remove(i);
        System.out.println("After:");
        System.out.println(sentence);
    }
}
