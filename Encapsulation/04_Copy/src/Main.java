public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(10, 20, 30);
        Cargo cargo = new Cargo(dimensions, 49, "Ростов", true, "Р559", false);
        System.out.println(cargo);;

        cargo = cargo.setDeliveryAddress("Москва");
        cargo = cargo.setWeight(15);
        System.out.println(cargo);

    }

}
