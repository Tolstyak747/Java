public class Printer {
    private String queue = "";
    private int countPages;
    private int allTimePages;

    public Printer(String name) {
        System.out.println(name);
        queue = "Перечень документов: \n";
    }

    public void append(String text, String name, int amount) {
        queue = queue + String.format("Текст: %s\nНазвание: %s\nКол-во страниц: %d\n", text, name, amount);
        countPages += amount;

    }

    public void append(String text) {
        append(text, "Неизвестно", 1);
    }

    public void append(String text, String name) {
        append(text, name, 1);
    }


    public void clear() {
        countPages = 0;
        queue = "";
    }

    public void print() {
        if (queue.isEmpty()) {
            System.out.println("Список документов пуст!");
        } else {
            allTimePages += countPages;
            System.out.println(queue);
            clear();
        }
    }

    public int getPendingPagesCount() {
        return countPages;
    }
    public int pagesForAllTime(){
        return allTimePages;
    }
}
