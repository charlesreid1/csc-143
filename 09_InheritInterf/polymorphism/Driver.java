public class Driver {
    public static void main(String[] args) {

        // What is the output of this code?
        Foo[] pity = {new Baz(), new Bar(), new Plink(), new Foo};
        for( int i = 0; i < pity.length; i++ ) {
            System.out.println(pity[i]);
            pity[i].method1();
            pity[i].method2();
            System.out.println();
        }

    }
}
