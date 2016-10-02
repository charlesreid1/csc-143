import essential.*;

public class SpiralTurtleDriver {
    public static void main(String[] args) { 

        SpiralTurtle tim = new SpiralTurtle();
        tim.drawSpiral();

        SpiralTurtle tom = new SpiralTurtle(0.3);
        tom.drawSpiral();

    }
}
