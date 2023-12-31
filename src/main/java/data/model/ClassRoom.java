package data.model;

import java.util.List;

public class ClassRoom {
    long id;
    String grade;
    List<Student> students;

    public ClassRoom(long id, String grade, List<Student> students) {
        this.id = id;
        this.grade = grade;
        this.students = students;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
