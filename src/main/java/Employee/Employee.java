package Employee;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter



public class Employee {
/* Основной класс конструктор, для создания герттеров и сеттреров мы используем  Lombok
* @link https://mvnrepository.com/artifact/org.projectlombok/lombok
* */
    private String fullName;
    private double salary;
    private LocalDate dateAcceptance;
    private String jobTitle;


    public Employee(String fullName, double salary, LocalDate dateAcceptance,String jobTitle) {
        this.fullName = fullName;
        this.salary = salary;
        this.dateAcceptance = dateAcceptance;
        this.jobTitle = jobTitle;


    }

    @Override
    public String toString() {
        return "\nPerson:" +
                "  name='" + fullName + '\'' +
                ", salary='" + salary + '\'' +
                ", dateAcceptance='" + dateAcceptance +'\''
                +",  jobTitle='" + jobTitle +'\''
                ;
    }
}


