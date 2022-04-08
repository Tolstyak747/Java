import java.util.Random;

public class Operator implements Employee {
    private int salary = random();

    public Operator() {
        getMonthSalary();
    }


    @Override
    public int getMonthSalary() {
        return salary;
    }

    @Override
    public int random() {
        Random random = new Random();
        int min = 10000;
        int max = 30000;
        int diff = max - min;
        return random.nextInt(diff + 1) + min;
    }
}
