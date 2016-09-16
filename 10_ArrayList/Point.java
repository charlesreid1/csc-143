/**
 * Point:
 * This Point class implements the Comparable interface,
 * and implements a sorting strategy of sorting Points 
 * by x first, then by y.
 */
public class Point implements Comparable<Point> {
    private int x;
    private int y;

    public Point( int x0, int y0 ) {
        this.x = x0; this.y = y0;
    }

    public String toString() { 
        return "(" + this.x + ", " + this.y + ")";
    }

    /** Sorting strategy: sort by comparing x; break any ties by comparing y */
    public int compareTo(Point other) { 
        if( x < other.x ) { 
            return -1;
        } else if ( x > other.x ) {
            return 1;
        } else if ( y < other.y ) { 
            return -1;
        } else if ( y > other.y ) { 
            return 1;
        } else {
            return 0;
        }
    }
}
