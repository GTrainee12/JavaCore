package Employee;

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Manager m1 = new Manager("Dmitriy",180000,LocalDate.of(2000,3,12),"Manager");
        Employee e1 = new Employee("Egor",70000, LocalDate.of(2005,5,10),"Employee");
        Employee e2 = new Employee("Alex",70000,LocalDate.of(2018,1, 2),"Employee");
        Employee e3 = new Employee("Genre",70000,LocalDate.of(2001,3, 1),"Employee");
        Employee e4 = new Employee("Arnold",70000,LocalDate.of(2016,12, 13),"Employee");


        List<Employee> employees = new ArrayList<>();
        employees.add(m1);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        System.out.println(employees);

        Manager.increaseSalary(employees, 10000);


        ComparatorDate comparator = new ComparatorDate();
        employees.sort(comparator);
        System.out.println(employees);

    }
}
