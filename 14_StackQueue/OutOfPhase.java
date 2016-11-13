import java.util.*;

// Heavily modified from http://courses.cs.washington.edu/courses/cse143/14wi/homework/ass2/PlayThatTune.java.html

public class OutOfPhase {

    public static void main(String[] args) {

        Random r = new Random();
        while (true) { 

            // read in the pitch, where 0 = Concert A (A4)
            int pitch = -r.nextInt(6);

            // read in duration in seconds
            double duration = 15.0;

            // control how far apart sine waves are spaced
            double alpha = 0.1;

            // build sine wave with desired frequency
            double hz  = 440 * Math.pow(2, pitch / 12.0);
            double hz2 = 440 * Math.pow(2, (  pitch - alpha*(2*r.nextDouble()-1) ) / 12.0);
            double hz3 = 440 * Math.pow(2, (  pitch + alpha*(2*r.nextDouble()-1) ) / 12.0); 
            System.out.printf("\nThree frequencies: %.2f Hz, %.2f Hz, %.2f Hz\n",hz2,hz,hz3);

            int N = (int) (StdAudio.SAMPLE_RATE * duration);
            double[] a = new double[N+1];

            for (int i = 0; i <= N; i++) {
                a[i]  = Math.sin(2 * Math.PI * i * hz  / StdAudio.SAMPLE_RATE);
                a[i] += Math.sin(2 * Math.PI * i * hz2 / StdAudio.SAMPLE_RATE);
                a[i] += Math.sin(2 * Math.PI * i * hz3 / StdAudio.SAMPLE_RATE);

            }

            // play it using standard audio
            StdAudio.play(a);
        }
    }
}
