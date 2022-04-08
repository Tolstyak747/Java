public class Cargo {
    private final Dimensions dimensions;
    private final int weight;
    private final String deliveryAddress;
    private final boolean turnOver;
    private final String registrationNumber;
    private final boolean fragile;

    public Cargo(Dimensions dimensions, int weight, String deliveryAddress, boolean turnOver, String registrationNumber, boolean fragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.turnOver = turnOver;
        this.registrationNumber = registrationNumber;
        this.fragile = fragile;
    }

    public Cargo setDeliveryAddress(String deliveryAddress) {
        return new Cargo(dimensions, weight, deliveryAddress, turnOver, registrationNumber, fragile);
    }

    public Cargo setDimensions(Dimensions dimensions) {
        return new Cargo(dimensions, weight, deliveryAddress, turnOver, registrationNumber, fragile);
    }

    public Cargo setWeight(int weight) {
        return new Cargo(dimensions, weight, deliveryAddress, turnOver, registrationNumber, fragile);
    }

    public String toString() {
        return dimensions + "Вес: " + weight + "\n" + "Адрес доставки: " + deliveryAddress + " \n" + "Рег.номер: " + registrationNumber;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getWeight() {
        return weight;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public boolean isTurnOver() {
        return turnOver;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isFragile() {
        return fragile;
    }
}
