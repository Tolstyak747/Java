import java.util.Random;

public class TopManager implements Employee {
    private int salary = random();
    private Company company;

    public TopManager(Company company) {
        this.company = company;
        getMonthSalary();
    }


    public int random() {
        Random random = new Random();
        int min = 90000;
        int max = 120000;
        int diff = max - min;
        return random.nextInt(diff + 1) + min;
    }

    @Override
    public int getMonthSalary() {
        if (this.company.getInCome() > 10000000) {
            return (int) (salary * 1.5);
        } else return salary;
    }

}
