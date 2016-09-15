/**
 * Farmyard Animal:
 * An abstract class that defines a generic farm animal.
 *
 * This class is abstract, because a "generic farm animal" cannot exist,
 * so this class must be overridden and only child classes declared. 
 *
 * Not all farm animals make noise (rabbits), so don't implement CanMakeNoise!
 */
abstract class Farmyard Animal {
    protected int positionX, positionY;
    public abstract void makeNoise(); // no method body
    public void move( newX, newY ) {
        positionX = newX;
        positionY = newY;
    }
}
