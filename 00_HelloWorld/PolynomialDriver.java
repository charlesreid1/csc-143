public class PolynomialDriver {
    public static void main(String[] args) { 

        double[] c1 = new double[4];
        // 4 x^3 + x^2 + 4 x + 1
        c1[3] = 4.0;
        c1[2] = 1.0;
        c1[1] = 4.0;
        c1[0] = 1.0;
        Polynomial p1 = new Polynomial(3,c1);

        double[] c2 = new double[3];
        // x^2 + 2x + 1
        c2[2] = 1.0;
        c2[1] = 2.0;
        c2[0] = 1.0;
        Polynomial p2 = new Polynomial(2,c2);

        Polynomial r = p1.add(p2);
        System.out.println(r);
    }
}

