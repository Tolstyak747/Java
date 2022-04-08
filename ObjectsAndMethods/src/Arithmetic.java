public class Arithmetic {


    private final int a;
    private final int b;

    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int addition() {
        return this.a + this.b;
    }

    public int multiplication() {
        return this.a * this.b;
    }

    public int max() {
        return Math.max(this.a, this.b);
    }

    public int min() {
        return Math.min(this.a, this.b);
    }
}
