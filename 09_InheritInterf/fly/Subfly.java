public class Subfly extends Superfly {
    private int b;
    public Superfly() { 
        super(0);
        this.b = 0;
    }
    public Superfly(int b) {
        super(0);
        this.b = b;
    }
    public Superfly(int a, int b) {
        super(a);
        this.b = b;
    }
}
