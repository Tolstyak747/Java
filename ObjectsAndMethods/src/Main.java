public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40, 3, 100);
        basket.print("Корзина 1");
        System.out.println();

        Basket vasya = new Basket();
        vasya.add("Apple", 40, 1);
        vasya.print("Корзина 2");
        System.out.println();


        Basket anya = new Basket();
        anya.add("Tomato", 10);
        anya.add("Nuts", 300);
        anya.add("Apple", 100);
        anya.print("Корзина 3");
        System.out.println();



        System.out.println("Общая стоимость всех корзин: " + Basket.getAllBasketPrice());
        System.out.println("Общее кол-во товаров во всех корзинах: " + Basket.getAllItemsInBasket());
        System.out.println("Средняя цена за единицу товара во всех корзинах: " + Basket.averagePrice());
        System.out.println("Cредняя стоимость корзины: " + Basket.averageBasketPrice());
    }
}
