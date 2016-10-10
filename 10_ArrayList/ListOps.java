import java.util.*;

public class ListOps {
    public static void main(String[] args) {
        ArrayList<String> sentence = new ArrayList<String>();
        sentence.add("This");
        sentence.add("is");
        sentence.add("a");
        sentence.add("sentence");
        sentence.add("with");
        sentence.add("some");
        sentence.add("words");
        System.out.println(sentence);
        // print the word "words"
        System.out.println(sentence.get(sentence.size()-1));
    }
}
