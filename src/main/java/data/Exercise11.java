package data;

import data.model.Student;
import data.model.StudentRepo;

import java.util.IntSummaryStatistics;

/**
 * Get Summary statics of students age in class
 */
public class Exercise11 {
    public static void main(String[] args) {
        IntSummaryStatistics result = StudentRepo.getAllStudents().stream().mapToInt(Student::getAge).summaryStatistics();
        System.out.println(result);
    }
}
