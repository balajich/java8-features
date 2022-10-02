package UKOCP86999;

import java.util.*;
 
class Student {
    private String name;
    public int ageInYears;
 
    public Student(String name, int age) {
        this.name = name;
        this.ageInYears = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ageInYears=" + ageInYears +
                '}';
    }

    public static int compareByAge(Student s1, Student s2) {
        return s2.ageInYears - s1.ageInYears;
    }
}
 
public class Test {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("john", 25), new Student("lucy", 21), new Student("ivy", 23));
        Collections.sort(students, Comparator.comparingInt((Student s) -> s.ageInYears));
        System.out.println(students);
    }
}