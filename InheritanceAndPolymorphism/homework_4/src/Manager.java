import java.util.Random;

public class Manager implements Employee {
    private int salary = 50000;
    private Company company;

    public Manager(Company company) {
        this.company = company;
        getMonthSalary();
    }

    public int random() {
        int max = 140000;
        int min = 115000;
        int diff = max - min;
        Random random = new Random();
        return random.nextInt(diff + 1) + min;
    }

    @Override
    public int getMonthSalary() {
        company.setInCome(random());
        return random() / 100 * 5 + salary;
    }
}
