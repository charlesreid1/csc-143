/**
 * Train:
 * Trains are very noisy.
 */
public class Train implements CanMakeNoise {
    public void makeNoise() {
        for(int j=0; j<4; j++) {
            System.out.print("a-chug a-chug ");
        }
        System.out.println("WOOOOOO WOOOOOOO");
    }
}
