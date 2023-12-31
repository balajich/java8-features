package data;

import data.model.Student;
import data.model.StudentRepo;

import java.util.Comparator;
import java.util.Optional;

/**
 * find student with max age
 */
public class Exercise6 {
    public static void main(String[] args) {

        Optional<Student> result = StudentRepo.getAllStudents().stream().max(Comparator.comparing(Student::getAge));
        System.out.println(result.get());
    }
}
