import essential.*;

/**
 * SpiralTurtle class:
 *
 * This class implements a Turtle, with one extra behavior:
 * it can draw spirals. Also defining a constructor that 
 * takes a spiral parameter.
 */
public class SpiralTurtle extends Turtle { 
    private double a; // Spiral compactness parameter

    /** Constructor taking a as a parameter */
    public SpiralTurtle(double a) { 
        this.a = a;
    }

    /** Constructor taking no parameter */
    public SpiralTurtle() { 
        this.a = 1.0;
    }

    /** Implement the extra behavior: draw a spiral. */
    public void drawSpiral() {
        for( int theta = 0; theta < 5*360; theta++ ) {
            setAngle(theta);
            forward( a*( theta / 360.0 ) );
        }
    }
}

