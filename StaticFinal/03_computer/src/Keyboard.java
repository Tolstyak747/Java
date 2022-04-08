public class Keyboard {
    private final Type type;
    private final boolean backlight;
    private final int weight;

    public Keyboard(Type type, boolean backlight, int weight) {
        this.type = type;
        this.backlight = backlight;
        this.weight = weight;
    }

    enum Type {
        WIRELESS, WIRED
    }

    public Type getType() {
        return type;
    }

    public boolean isBacklight() {
        return backlight;
    }

    public int getWeight() {
        return weight;
    }
}
