package UKOCP19705;
class Student{
    int getMarks(){
        return 10;
    }
}
interface MyInterface{
    int callMarks(Student s);
}
public class Test {
    public static void main(String[] args) {
        //MyInterface obj=(s)->s.getMarks();
        MyInterface obj1=Student::getMarks;
        obj1.callMarks(new Student());
    }

}
