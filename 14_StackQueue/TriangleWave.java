import java.util.*;

// Modified from http://courses.cs.washington.edu/courses/cse143/14wi/homework/ass2/PlayThatTune.java.html

public class TriangleWave {

    public static void main(String[] args) {

        Random r = new Random();
        // repeat as long as there are more integers to read in
        while (true) { 

            // read in the pitch, where 0 = Concert A (A4)
            int pitch = r.nextInt(8); 

            // read in duration in seconds
            double duration = 2.0;

            // build wave with desired frequency
            double hz = 440 * Math.pow(2, pitch / 12.0);
            int N = (int) (StdAudio.SAMPLE_RATE * duration);
            double[] a = new double[N+1];

            // Populate the array with triangle wave samples
            for (int i = 0; i <= N; i++) {
                // asin(sin()) creates a linear function 
                // slope is +1 when sin is increasing,
                // slope is -1 when sin is decreasing
                a[i] = Math.asin(Math.sin( 2 * Math.PI*i * hz / StdAudio.SAMPLE_RATE ));
            }

            // play it using standard audio
            StdAudio.play(a);
        }
    }
}
