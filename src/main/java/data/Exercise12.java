package data;

import data.model.ClassRoom;
import data.model.ClassRoomRepo;
import data.model.Student;
import data.model.StudentRepo;

import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/**
 * Get maps of classroom and average age
 */
public class Exercise12 {
    public static void main(String[] args) {
        Map<String, Double> result = ClassRoomRepo.getAllClassRooms().stream().collect(Collectors.toMap(ClassRoom::getGrade, classRoom -> classRoom.getStudents().stream().mapToInt(Student::getAge).average().getAsDouble()));
        result.forEach((key,value)-> System.out.println(key+":"+value));
    }
}
