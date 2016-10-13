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

        // Be careful! These arrays are listed in reverse order, 
        // so that element 0 corresponds to x^0,
        // element 1 corresponds to x^1, etc.
        // So, you have to reverse the normal order of the coefficients.
        //
        // 1a 
        Polynomial p1 = new Polynomial(new double[] {10, -1, 2});
        //Polynomial p2 = new Polynomial(new double[] {9, 0, -1});
        //Polynomial p3 = p1.add(p2);
        System.out.println(p1);
        //System.out.println(p2);
        //System.out.println(p3);
        
    }
}

