/**
 * Polynomial
 * Worksheet 1 
 * Dr. Reid
 *
 * This class implements a Polynomial as an object
 * using an array for storing information about the 
 * coefficients. It defines several useful features:
 * - copy constructor
 * - polymorphic add method (Polynomials or integers or doubles)
 *
 * Polynomial coefficients are stored as an array
 * and are indexed by degree:
 *
 * coefficients[0] = coefficient of x^0
 * coefficients[1] = coefficient of x^1
 * coefficients[2] = coefficient of x^2
*/
public class Polynomial {
    private int degree;
    private double[] coefficients;

    public Polynomial(double[] coefficients) {
        // If we wanted to do error-checking, this is the place.
        this.coefficients = coefficients;
        this.degree = coefficients.length+1;
    }
    
    /* Constructor to make a new Polynomial from an old one */
    public Polynomial( Polynomial p ) {
        this.degree = p.degree;

        // Note: we can't just say this.coefficients = p.coefficients, 
        // b/c then they would point to the same array in memory 
        // (that would be a shallow copy)
        int len = p.degree-1;
        this.coefficients = new double[len];
        for(int i=0; i<len; i++) {
            this.coefficients[i] = p.coefficients[i];
        }
    }
    
    public Polynomial add(double a) { 
        Polynomial result = new Polynomial(this);
        // add x to the degree 0 term
        result.coefficients[0] += a;
        return result;
    }

    public Polynomial add(Polynomial q) { 
        // Add two polynomials:
        //   r = p + q
        
        Polynomial r;

        if( q.degree > this.degree ) {

            r = new Polynomial(q);

            // Add coeffs from p
            for( int d = 0; d < this.degree; d++ ) {
                r.coefficients[d] = this.coefficients[d];
            }

        } else {

            r = new Polynomial(this);

            // Add coeffs from q
            System.out.println(q);
            for( int d = 0; d < q.degree; d++ ) { 
                r.coefficients[d] += q.coefficients[d];
            }

        }

        return r;
    }

    public String toString() { 
        String r = "";
        for( int d = this.coefficients.length-1; d >= 0; d-- ) {
            r += Math.abs(this.coefficients[d]);
            if( d > 0 ) {
                r += " x";
                if( d > 1 ) {
                    r += "^" + d + " ";
                } else {
                    r += " ";
                }
                if( this.coefficients[d-1] < 0 ) {
                    r += "- ";
                } else {
                    r += "+ ";
                }
            } 
        }
        return r;

    }
}
