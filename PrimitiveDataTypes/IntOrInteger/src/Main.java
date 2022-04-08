public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        int start = 0;
        int end = 0;
        for (int x = 0; x < Character.MAX_VALUE; x++) {
            char character = (char) x;
            if (character == 'А') {
                start = x;
            } else if (character == 'я') {
                end = x;
            } else if (character == 'ё') {
                System.out.println("Буква ё: " + x);
            } else if (character == 'Ё') {
                System.out.println("Буква Ё: " + x);
            }
        }
        System.out.println("Остальные русские буквы начинаются с " + start + " по " + end + " символ.");
    }

}

