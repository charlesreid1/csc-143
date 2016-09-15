/**
 * Duck:
 * The duck class implements CanMakeNoise, quack quack!
 */
class Duck extends FarmyardAnimal implements CanMakeNoise {
    public void makeNoise() {
        System.out.println("Quack!");
    }
}
