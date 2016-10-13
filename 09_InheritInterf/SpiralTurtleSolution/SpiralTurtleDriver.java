/** SpiralTurtleDriver
 *
 * We don't need to import essential.jar here,
 * because we are only using the SpiralTurtle class,
 * and that class is defined in a file in this directory.
 *
 * The SpiralTurtle class is the only class that 
 * uses the Turtle class, and so is the only class
 * that needs to import essential.jar.
 */
public class SpiralTurtleDriver {
    public static void main(String[] args) { 
        SpiralTurtle tom = new SpiralTurtle(0.3);
        tom.drawSpiral();
    }
}
