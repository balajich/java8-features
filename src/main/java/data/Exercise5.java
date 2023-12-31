package data;

import data.model.Student;
import data.model.StudentRepo;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * filter students age greater than 24 years and country IN
 */
public class Exercise5 {
    public static void main(String[] args) {
        //filter students age greater than  24 and country IN
        Predicate<Student> agePredicate= student -> student.getAge()>24;
        Predicate<Student> countryPredicate= student -> student.getCountry().equalsIgnoreCase("IN");
        List<Student> result = StudentRepo.getAllStudents().stream().filter(student->agePredicate.and(countryPredicate).test(student)).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
