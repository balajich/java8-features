package data.model;

import java.util.ArrayList;
import java.util.List;

public class StudentRepo {
    public static List<Student> getAllStudents(){
        List<Student> students= new ArrayList<>();
        students.addAll(getGrade1Students());
        students.addAll(getGrade2Students());
        return students;
    }

    public static List<Student> getGrade1Students(){
        List<Student> students= new ArrayList<>();
        students.add(new Student(1,"Alex",20,"UK"));
        students.add(new Student(2,"Anna",25,"US"));
        students.add(new Student(3,"Ram",26,"IN"));
        students.add(new Student(4,"Liza",21,"US"));

        return students;
    }

    public static List<Student> getGrade2Students(){
        List<Student> students= new ArrayList<>();
        students.add(new Student(5,"Sita",26,"IN"));
        students.add(new Student(6,"Matt",27,"UK"));
        students.add(new Student(7,"Hanuma",27,"IN"));
        return students;
    }
}
