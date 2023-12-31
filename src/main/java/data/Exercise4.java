package data;

import data.model.Student;
import data.model.StudentRepo;

import java.util.List;
import java.util.stream.Collectors;

/**
 * filter students age greater than 24 years
 */
public class Exercise4 {
    public static void main(String[] args) {
        //filter students age greater than  24
        List<Student> result = StudentRepo.getAllStudents().stream().filter(student -> student.getAge() > 24).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
