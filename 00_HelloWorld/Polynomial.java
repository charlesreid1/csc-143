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
            for( int d = 0; d < this.coefficients.length; d++ ) {
                r.coefficients[d] = this.coefficients[d];
            }

        } else {

            r = new Polynomial(this);

            // Add coeffs from q
            for( int d = 0; d < q.coefficients.length; d++ ) { 
                r.coefficients[d] += q.coefficients[d];
            }

        }

        return r;
    }

    public double evaluate( double x0 ) { 
        double result = 0;
        for( int i=0; i<this.coefficients.length; i++) {
            result += this.coefficients[i]*Math.pow(x0,i);
        }
        return result;
    }

    public String toString() { 
        String r = "";
        for( int d = this.coefficients.length-1; d >= 0; d-- ) {

            double val = Math.abs(this.coefficients[d]);
            boolean coefficient_of_1, coefficient_of_0, degree_nonzero, degree_gt_1;

            coefficient_of_1 = (Math.abs(val-1.0)<0.0001);
            coefficient_of_0 = (Math.abs(val)<0.0001);
            degree_nonzero = (d > 0);
            degree_gt_1 = (d > 1);

            if( coefficient_of_0 || coefficient_of_1 ) {
                r += "";
            } else {
                r += Math.abs(this.coefficients[d]);
            } 

            if( degree_nonzero && !coefficient_of_0 ) { 
                r += " x";
                if( degree_gt_1 ) { 
                    r += "^" + d + " ";
                } else if( coefficient_of_0 ) { 
                    r += "";
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
