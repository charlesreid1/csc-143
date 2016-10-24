public class PrintBinary {
    public static void main(String[] args) { 
        printBinary(501);
    }

    // Prints the given integer's binary representation.
    // Handles negative numbers gracefully.
    public static void printBinary(int n) {
        if (n < 0) {
            // recursive case for negative numbers
            System.out.print("-");
            printBinary(-n);
        } else if (n < 2) {
            // base case; same as base 10
            System.out.print(n);
        } else {
            // recursive case; break number apart
            printBinary(n / 2);
            printBinary(n % 2);
        }
    }

    // Prints the given integer's binary representation.
    // Requires n >= 0
    public static void printBinaryNoNegatives(int n) { 
        if( n < 2 ) { 
            System.out.println(n);
        } else {
            // recursive case; break number apart
            printBinary(n / 2);
            printBinary(n % 2);
        }
    }
}
