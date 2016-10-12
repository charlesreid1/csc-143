/*
Polynomial class

Polynomial coefficients are indexed by degree

coefficients[0] = coefficient of x^0
coefficients[1] = coefficient of x^1
coefficients[2] = coefficient of x^2
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
        this.coefficients = new double[len];
        for(int i=0; i<p.coefficients.length; i++){
            newcoeff[i] = p.coefficients[i];
        }
    }
    
    pubilc Polynomial add(int a) { 
        Polynomial result = new Polynomial(this);
        // add x to the degree 0 term
        result.coeffs[0] += a;
        return result;
    }

    public Polynomial add(Polynomial q) { 
        // Add two polynomials:
        //   r = p + q
        
        if( q.degree > this.degree ) {
            Polynomial r = new Polynomial(q);
        } else {
            Polynomial r = new Polynomial(this);
        
        // Add coeffs from p
        for( int d = 0; d <= this.degree; d++ ) {
            r.coefficients[d] = this.coefficients[d];
        }

        // Add coeffs from q
        for( int d = 0; d <= q.degree; d++ ) { 
            r.coefficients[d] += q.coefficients[d];
        }

        return r;
    }

    public String toString() {
        String r = "";
        for( int d = this.degree; d >= 0; d-- ) {
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
