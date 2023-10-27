package Employee;

import java.time.LocalDate;
import java.util.List;

public class Manager extends Employee {

    public Manager(String fullName, int salary, LocalDate dateAcceptance,String jobTitle) {
        super(fullName, salary, dateAcceptance,jobTitle);
    }
/*
* Статический метод для повышения зарплаты сотрудникам (кроме руководителей)
* */
    public static void increaseSalary(List<Employee> employees, double increaseAmount) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                double currentSalary = employee.getSalary();
                employee.setSalary(currentSalary + increaseAmount);
            }
        }
    }
}
