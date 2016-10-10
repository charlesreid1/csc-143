import java.util.*;

public class ComparablePoints {
    public static void main(String[] args) { 
        ArrayList<Point> points = new ArrayList<Point>();
        points.add( new Point(8,-15) );
        points.add( new Point(7,10) );
        points.add( new Point(12,32) );
        points.add( new Point(13,-25) );
        points.add( new Point(8,30) );
        points.add( new Point(10,-13) );
        points.add( new Point(12,65) );
        points.add( new Point(10,7) );
        points.add( new Point(7,7) );
        points.add( new Point(12,-25) );
        points.add( new Point(10,11) );
        points.add( new Point(10,43) );
        points.add( new Point(8,5) );

        Collections.sort(points);
        System.out.println("Points ArrayList:");
        System.out.println(points);

    }
}
