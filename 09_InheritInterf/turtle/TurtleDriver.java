import essential.*;

public class TurtleDriver { 
    public static void main(String[] args) { 
        Turtle tim = new Turtle();

        int size = 10;
        for( int i = 1; i <= 4; i++ ) {
            tim.forward(size);
            tim.right(90);
        }
    }
}
