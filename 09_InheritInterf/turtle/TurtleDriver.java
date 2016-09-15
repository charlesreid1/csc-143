import essential.*;

public class TurtleDriver { 
    public static void main(String[] args) { 
        Turtle tim = new Turtle();

        for( int size = 10; size <= 60; size += 10 ) {
            for( int j = 1; j <= 4; j++ ) {
                tim.forward(size);
                tim.right(90);
            }
        }

    }
}
