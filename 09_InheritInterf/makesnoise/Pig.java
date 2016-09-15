/**
 * Pig:
 * Yes, pigs are very noisy, so they implement the CanMakeNoise interface.
 */
public class Pig extends FarmyardAnimal implements CanMakeNoise {
    public void makeNoise() { 
        System.out.println("Oink!");
    }
}
