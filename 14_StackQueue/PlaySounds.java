import java.util.*;

// Modified from http://courses.cs.washington.edu/courses/cse143/14wi/homework/ass2/PlayThatTune.java.html
// so that it works without the StdIn class.

public class PlaySounds {

    public static void main(String[] args) {

        Random r = new Random();
        while (true) { 

            // read in the pitch, where 0 = Concert A (A4)
            int pitch = r.nextInt(8); 

            // read in duration in seconds
            double duration = 2.0;

            // build sine wave with desired frequency
            double hz = 440 * Math.pow(2, pitch / 12.0);
            int N = (int) (StdAudio.SAMPLE_RATE * duration);
            double[] a = new double[N+1];
            for (int i = 0; i <= N; i++) {
                a[i] = Math.sin(2 * Math.PI * i * hz / StdAudio.SAMPLE_RATE);
            }

            // play it using standard audio
            StdAudio.play(a);
        }
    }
}
