package inners;

public class Outer {
    private int a = 15;

    public class Inner {
        public int b = 20;

        public int getOuterA() {
            return a;
        }
    }
}
