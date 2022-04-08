public class StorageDevice {
    private final Type type;
    private final int memory;
    private final int weight;

    public StorageDevice(Type type, int memory, int weight) {
        this.type = type;
        this.memory = memory;
        this.weight = weight;
    }

    enum Type {
        HDD, SSD
    }

    public Type getType() {
        return type;
    }

    public int getMemory() {
        return memory;
    }

    public int getWeight() {
        return weight;
    }
}
