public class Main {

    public static void main(String[] args) {
        Book book = new Book("Мертвые души", "Н.В. Гоголь", 30, 1047);
        System.out.println(book.getAuthor());

        Product product = new Product("Макароны", 1047586541);
        product.setPrice(300);
        System.out.println(product.getBarCode() + product.getPrice());


    }
}
