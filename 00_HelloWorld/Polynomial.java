
public class Polynomial {
    int degree;
    double[] coefficients;

    public Polynomial(int degree, double[] coefficients) {
        // Polynomial coefficients are indexed by degree
        // coefficients[0] = coefficient of x^0
        // coefficients[1] = coefficient of x^1
        // coefficients[2] = coefficient of x^2

        if( coefficients.length != degree+1 ) { 
            System.out.println("Uh oh. Coefficients length should be degree + 1.");
        }

        this.degree = degree;
        this.coefficients = coefficients;
    }

    public Polynomial add(Polynomial q) { 
        // Add two polynomials:
        //   r = p + q

        // Result polynomial will have degree maxd 
        int maxd = Math.max(this.degree,q.degree);
        int r_degree = maxd;
        double[] r_coeffs = new double[maxd+1];

        // Add coeffs from p
        for( int d = 0; d <= this.degree; d++ ) {
            r_coeffs[d] += this.coefficients[d];
        }

        // Add coeffs from q
        for( int d = 0; d <= q.degree; d++ ) { 
            r_coeffs[d] += q.coefficients[d];
        }

        Polynomial r = new Polynomial(r_degree,r_coeffs);
        return r;
    }

    public String toString() {
        String r = "";
        for( int d = this.degree; d >= 0; d-- ) {
            r += this.coefficients[d];
            if( d > 0 ) {
                r += " x";
                if( d > 1 ) {
                    r += "^" + d + " ";
                } else {
                    r += " ";
                }
                r += "+ ";
            } 
        }
        return r;

    }
}
