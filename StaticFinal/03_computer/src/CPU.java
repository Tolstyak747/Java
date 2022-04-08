public class CPU {
    private final double frequency;
    private final int numberOfCores;
    private final String manufacturer;
    private final int weight;

    public CPU(double frequency, int numberOfCores, String manufacturer, int weight) {
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public double getFrequency() {
        return frequency;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getWeight() {
        return weight;
    }
}
