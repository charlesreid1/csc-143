import java.util.*;

public class SieveList {
    public static void main(String[] args) { 
        System.out.println("Sieve List:");
        System.out.println("This program will find all primes up to a user-specified number.");
        System.out.println();

        Scanner console = new Scanner(System.in);
        System.out.print("Maximum number? ");
        int max = console.nextInt();

        List<Integer> primes = sieve(max);
        System.out.println("prime numbers up to " + max + ":");
        System.out.println(primes);
    }

    public static List<Integer> sieve(int max) {
        
        List<Integer> primes = new LinkedList<Integer>();
        List<Integer> numbers = new LinkedList<Integer>();

        for( int i=2; i<=max; i++ ) {
            numbers.add(i);
        }

        while(!numbers.isEmpty()) {
            // remove prime number from front of list
            int front = numbers.remove(0);
            primes.add(front);
            // remove all multiples of this prime number
            Iterator<Integer> iter = numbers.iterator();
            while(iter.hasNext()) {
                int current = iter.next();
                if( current%front == 0 ) {
                    iter.remove();
                }
            }
        }

        return primes;

    }
}
