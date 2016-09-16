import java.util.*;

public class EuclidianDriver {
    public static void main(String[] args) { 
        int n = 40;
        ArrayList<Integer> fibs = GCD.fibonacci(n);
        for(int i=1; i<fibs.size(); i++) {
            System.out.println("GCD of "+fibs.get(i)+" and "+fibs.get(i-1)+":");
            System.out.println( GCD.gcd( fibs.get(i), fibs.get(i-1) ) );
            System.out.println();
        }

        ArrayList<Integer> diffs = GCD.diffCubes(n);
        for(int i=1; i<diffs.size(); i++) {
            System.out.println("GCD of "+diffs.get(i)+" and "+diffs.get(i-1)+":");
            System.out.println( GCD.gcd( diffs.get(i), diffs.get(i-1) ) );
            System.out.println();
        }
    }
}
