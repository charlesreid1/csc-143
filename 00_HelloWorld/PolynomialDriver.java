public class PolynomialDriver {
    public static void main(String[] args) { 

        /*
        2, -1, 10
        -1, 0, +9
        
        8, -21, 14, -12
        -2, 0, 8, 0, -1
        
        1, -7, 12, 0
        32, 4, -8, -1
        
        2, -1
        1, 0, 0, 0
        
        1, -1, 0
        9, 12
        
        1, -2, 1
        4
        
        1, 0, 1, 0, 1, 1, 0
        2
        
        1, -4, 1, -4, 0
        4
        
        8, 10, 0
        -7
        
        1, 0, 0
        9
        */

        Polynomial p1, p2, p3;

        // Be careful! These arrays are listed in reverse order, 
        // so that element 0 corresponds to x^0,
        // element 1 corresponds to x^1, etc.
        // So, you have to reverse the normal order of the coefficients.

        // Problem 1a 
        p1 = new Polynomial(new double[] {10, -1, 2});
        p2 = new Polynomial(new double[] {9, 0, -1});
        p3 = p1.add(p2);
        printPolynomials(p1,p2,p3);

        // Problem 1b
        p1 = new Polynomial(new double[] {-12, 14, -21,  8});
        p2 = new Polynomial(new double[] { -1,  0,  8,   0, -2});
        p3 = p1.add(p2);
        printPolynomials(p1,p2,p3);

        // Problem 1c 
        p1 = new Polynomial(new double[] {0, 12, -7, 1});
        p2 = new Polynomial(new double[] {-1, -8, 4, 32});
        p3 = p1.add(p2);
        printPolynomials(p1,p2,p3);

        // Problem 1d
        p1 = new Polynomial(new double[] {-1, 2});
        p2 = new Polynomial(new double[] {0, 0, 0, 1});
        p3 = p1.add(p2);
        printPolynomials(p1,p2,p3);

        // Problem 1e
        p1 = new Polynomial(new double[] {0, -1, 1});
        p2 = new Polynomial(new double[] {12, 9});
        p3 = p1.add(p2);
        printPolynomials(p1,p2,p3);

        // Problem 1f
        p1 = new Polynomial(new double[] {1, -2, 1});
        p3 = p1.add(4.0);
        printPolynomials(p1,4.0,p2);

        // Problem 1g
        p1 = new Polynomial(new double[] {0, 1, 1, 0, 1, 0, 1});
        p3 = p1.add(2.0);
        printPolynomials(p1,2.0,p2);

        // Problem 1h
        p1 = new Polynomial(new double[] {0, -4, 1, -4, 1});
        p3 = p1.add(4.0);
        printPolynomials(p1,4.0,p2);

        // Problem 1i
        p1 = new Polynomial(new double[] {0, 10, 8});
        p3 = p1.add(-7.0);
        printPolynomials(p1,-7.0,p2);

        // Problem 1j
        p1 = new Polynomial(new double[] {0, 0, 1});
        p3 = p1.add(9.0);
        printPolynomials(p1,9.0,p2);

        System.out.println();

        System.out.println("Evaluating x^2 - 9 for x=1, should return -8.");
        p1 = new Polynomial(new double[] {-9, 0, 1});
        double x0 = 1.0;
        System.out.println(p1.evaluate(x0));
    }



    public static void printPolynomials(Polynomial p1, Polynomial p2, Polynomial p3) {
        System.out.print(p1);
        System.out.print("  +  ");
        System.out.print(p2);
        System.out.print("  =  ");
        System.out.print(p3);
        System.out.println();
    }

    public static void printPolynomials(Polynomial p1, double f, Polynomial p2) {
        System.out.print(p1);
        System.out.print("   +  ");
        System.out.print(f);
        System.out.print("   =  ");
        System.out.print(p2);
        System.out.println();
    }
}

