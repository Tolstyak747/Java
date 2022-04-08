import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);


        Employee employeeMaxSalary = findEmployeeWithHighestSalary(staff, 2018);
        System.out.println(employeeMaxSalary);
    }


    public static Employee findEmployeeWithHighestSalary(List<Employee> staff, int year) {
        return staff.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .filter(employee -> employee.toString().contains(Integer.toString(year)))
                .findFirst()
                .get();
    }
}
