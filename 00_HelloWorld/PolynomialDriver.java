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
        
        double[] c1 = new double[4];
        // 4 x^3 + x^2 + 4 x + 1
        c1[3] = 4.0;
        c1[2] = 1.0;
        c1[1] = 4.0;
        c1[0] = 1.0;
        Polynomial p1 = new Polynomial(3,c1);

        // x^2 + 2x + 1
        double[] c2 = {1.0, 2.0, 1.0};
        Polynomial p2 = new Polynomial(2,c2);

        Polynomial p3 = new Polynomial(2,new double[] {-2.0,1.0,1.0});
        Polynomial s = p2.add(p3);
        System.out.println(s);

        //Polynomial r = p1.add(p2);
    }
}

