package Student;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Getter
@Setter
class Student {
    private String name;
    private List<Double> grades;
    private String specialty;

    public Student(String name, List<Double> grades, String specialty) {

        this.name = name;
        this.grades = grades;
        this.specialty = specialty;
    }

/**
 * метод getAverageGrade() возвращает средний балл студента.
 */
    public double getAverageGrade() {
        return grades.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Иванов", List.of( 4.7), "Алгебра"));
        students.add(new Student("Петров", List.of( 4.0), "Физика"));
        students.add(new Student("Сидоров", List.of(4.9), "Информатика"));
        students.add(new Student("Смирнова", List.of(4.5), "Биология"));
        students.add(new Student("Васильев", List.of(4.6), "Математика"));
        students.add(new Student("Ковалев", List.of(4.8), "Информатика"));
        students.add(new Student("Николаева", List.of(4.5), "Физика"));
        students.add(new Student("Орлов", List.of(4.6), "Информатика"));
        students.add(new Student("Миронов", List.of( 4.3), "Мат.анализ"));
        students.add(new Student("Соколова", List.of(4.9), "Информатика"));


        List<Student> filteredStudents = students.stream()
                /* Фильтрация студентов по специальности "Информатика" с помощью метода filter()
                * */
                .filter(student -> student.getSpecialty().equals("Информатика"))
                /* Фильтрация студентов по среднему баллу выше 4.5 с помощью метода filter()
                * */
                .filter(student -> student.getAverageGrade() > 4.5)
                /* Сортировка студентов по убыванию среднего балла с помощью метода sorted()
                * */
                .sorted(Comparator.comparingDouble(Student::getAverageGrade).reversed())
                /*Ограничение количества результатов до 5 с помощью метода limit()
                * */
                .limit(5)
                /*Сбор результатов в список с помощью метода collect()
                * */
                .toList();

        filteredStudents.forEach(student -> System.out.println(student.getName() + " - " + student.getAverageGrade()));
    }
}