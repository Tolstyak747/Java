public class Dimensions {
    private  final int width;
    private final int height;
    private final int length;

    public Dimensions(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int volume(){
        return width * height * length;
    }

    public String toString(){
        return "Габариты: \n" +
                "Высота - " + height + "\n" +
                "Длина - " + length + "\n" +
                "Глубина - " + width + "\n";

    }
}
