package data;

import data.model.Student;
import data.model.StudentRepo;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Sort students by name
 */
public class Exercise3 {
    public static void main(String[] args) {
        //Sort by students by name
        List<Student> result = StudentRepo.getAllStudents().stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
