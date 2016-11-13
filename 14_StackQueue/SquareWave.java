import java.util.*;

// Modified from http://courses.cs.washington.edu/courses/cse143/14wi/homework/ass2/PlayThatTune.java.html

public class SquareWave {

    public static void main(String[] args) {

        Random r = new Random();
        // repeat as long as there are more integers to read in
        while (true) { 

            // read in the pitch, where 0 = Concert A (A4)
            int pitch = r.nextInt(8); 

            // read in duration in seconds
            double duration = 0.1;

            // build wave with desired frequency
            double hz = 440 * Math.pow(2, pitch / 12.0);
            int N = (int) (StdAudio.SAMPLE_RATE * duration);
            double[] a = new double[N+1];

            // Now populate the array with square wave samples
            for (int i = 0; i <= N; i++) {
                // signum takes the sign of the function and turns it into -1, 0, or 1
                a[i] = Math.signum( Math.sin(2 * Math.PI * i * hz / StdAudio.SAMPLE_RATE) );
            }

            // play it using standard audio
            StdAudio.play(a);
        }
    }
}
