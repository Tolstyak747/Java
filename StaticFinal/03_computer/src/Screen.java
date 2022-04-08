public class Screen {
    private final int diagonal;
    private final Type type;
    private final int weight;


    public Screen(int diagonal, Type type, int weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    enum Type {
        IPS, TN, VA
    }

    public int getDiagonal() {
        return diagonal;
    }

    public Type getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }
}
