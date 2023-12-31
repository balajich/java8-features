package data;

import data.model.Student;
import data.model.StudentRepo;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Sort students by Decreasing order of age
 */
public class Exercise2 {
    public static void main(String[] args) {
        //Sort by decreasing order of age
        List<Student> result = StudentRepo.getAllStudents().stream().sorted(Comparator.comparing(Student::getAge).reversed()).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
