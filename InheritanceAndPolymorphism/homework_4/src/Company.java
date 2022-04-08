import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Company {
    private List<Employee> employees = new ArrayList<>();
    private int inCome;


    public int getInCome() {
        return inCome;
    }

    public void setInCome(int earned) {
        inCome += earned;
    }


    public void hireOperator() {
        Operator oper = new Operator();
        employees.add(oper);
    }

    public void hireManager() {
        Manager manager = new Manager(this);
        employees.add(manager);
    }

    public void hireTopManager() {
        TopManager topManager = new TopManager(this);
        employees.add(topManager);
    }

    public void hireAll(int operator, int manager, int topManager) {
        for (int i = 0; i < operator; i++) {
            hireOperator();
        }
        for (int i = 0; i < manager; i++) {
            hireManager();
        }
        for (int i = 0; i < topManager; i++) {
            hireTopManager();
        }
    }

    public void fire(int count) {
        for (int i = 0; i < count; i++) {
            int index = (int) (Math.random() * employees.size());
            employees.remove(index);

        }
    }

    public List<Employee> getTopSalaryStaff(int count) {
        return getFilteredLimitedList(count, new Comparator<Employee>() {
            public int compare(Employee o1, Employee o2) {
                return o2.getMonthSalary() - o1.getMonthSalary();
            }
        });
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        return getFilteredLimitedList(count, new Comparator<Employee>() {
            public int compare(Employee o1, Employee o2) {
                return o1.getMonthSalary() - o2.getMonthSalary();
            }
        });
    }

    private List<Employee> getFilteredLimitedList(int count, Comparator<Employee> comparator) {
        List<Employee> copyList = new ArrayList<Employee>(employees);
        Collections.sort(copyList, comparator);
        List<Employee> result = new ArrayList<Employee>();
        for (int i = 0; i < count; i++) {
            result.add(copyList.get(i));
        }
        return result;
    }

    public void printTop(int count) {
        System.out.println("Самые высокие зарплаты: ");
        for (Employee emp : getTopSalaryStaff(count)) {
            System.out.println(emp.getMonthSalary());
        }
    }

    public void printLow(int count) {
        System.out.println("Самые низкие зарплаты: ");
        for (Employee emp : getLowestSalaryStaff(count)) {
            System.out.println(emp.getMonthSalary());
        }
    }
}

