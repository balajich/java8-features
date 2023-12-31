package data;

import data.model.Student;
import data.model.StudentRepo;

import java.util.OptionalDouble;

/**
 * Average age in the class
 */
public class Exercise9 {
    public static void main(String[] args) {
        OptionalDouble result = StudentRepo.getAllStudents().stream().mapToInt(Student::getAge).average();
        System.out.println(result.getAsDouble());
    }
}
