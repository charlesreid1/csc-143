import java.util.*;

public class SimpleList {
    public static void main(String[] args) { 
        ArrayList<String> A = new ArrayList<String>();
        A.add("foo");
        A.add("bar");
        A.add("wim");
        System.out.println("Before: ");
        System.out.println(A);
        for(int i = 1; i <= A.size(); i++ ) {
            A.add(i,"fuz");
            i++;
        }
        System.out.println("After: ");
        System.out.println(A);
    }
}
