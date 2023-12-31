package data;

import data.model.Student;
import data.model.StudentRepo;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Group Students by Country
 */
public class Exercise8 {
    public static void main(String[] args) {
        Map<String, List<Student>> result = StudentRepo.getAllStudents().stream().collect(Collectors.groupingBy(Student::getCountry));
        result.forEach((key,value)-> System.out.println(key+":"+value));
    }
}
