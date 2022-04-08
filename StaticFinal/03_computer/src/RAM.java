public class RAM {
    private final Type type;
    private final int volume;
    private final int weight;

    public RAM(Type type, int volume, int weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    enum Type {
        DDR2, DDR3, RIMM
    }

    public Type getType() {
        return type;
    }

    public int getVolume() {
        return volume;
    }

    public int getWeight() {
        return weight;
    }

}
