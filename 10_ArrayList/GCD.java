import java.util.*;

/** 
 * GCD:
 * This is a static class implementing 
 * the extended Euclidian algorithm to compute
 * the GCD of two numbers. 
 */
public class GCD {

    /** Returns the greatest common denominator (GCD), 
     * computed using the Euclidian algorithm. */
    public static int gcd(int a, int b) {
        int small, big;
        int new_small, new_big;
        int remainder;
        int gcd;

        if(a > b) {
            big = a;
            small = b;
        } else {
            big = b;
            small = a;
        }

        while(true) {
            remainder = big % small;

            if(remainder==0) {
                gcd = small;
                break;
            }
            
            new_small = remainder;
            new_big = small;

            small = new_small;
            big = new_big;
        }        

        return gcd;

    }

    public static ArrayList<Integer> fibonacci( int n ) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        result.add(1); // F1
        result.add(1); // F2
        for(int i=2; i<n; i++) {
            int F_i = result.get(i-1) + result.get(i-2);
            result.add(F_i);
        }

        return result;
    }

    public static ArrayList<Integer> diffSquares( int n ) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        // (1^2 - 0^2), (2^2 - 1^2), (3^2 - 2^2), etc.
        result.add(1);
        for(int i=2; i<n; i++) { 
            int s = i*i - (i-1)*(i-1);
            result.add(s);
        }
        return result;
    }

    public static ArrayList<Integer> diffCubes( int n ) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        // (1^3 - 0^3), (2^3 - 1^3), (3^3 - 2^3), etc.
        result.add(1);
        for(int i=2; i<n; i++) { 
            int s = i*i*i - (i-1)*(i-1)*(i-1);
            result.add(s);
        }
        return result;
    }
}
