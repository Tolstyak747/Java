public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.hireAll(180,100,10);
        company.printTop(5);
        System.out.println();
        company.printLow(5);
        company.fire(100);
        System.out.println();
        company.printTop(5);
    }

}

