public class Book {
    private final String name;
    private final String author;
    private final int amountPages;
    private final int numberOfIsbn;

    public Book(String name, String author, int amountPages, int numberOfIsbn) {
        this.name = name;
        this.author = author;
        this.amountPages = amountPages;
        this.numberOfIsbn = numberOfIsbn;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getAmountPages() {
        return amountPages;
    }

    public int getNumberOfIsbn() {
        return numberOfIsbn;
    }
}
