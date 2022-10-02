package exam;

public class ClassDemo1 {
    @Override
    public String toString() {
        return "ClassDemo1{" +
                "number=" + number +
                '}';
    }

    int number;

    public int getNumber() {
        return number;
    }

    public ClassDemo1() {
    }

    public ClassDemo1 setNumber(int number) {
        this.number = number;
        return this;
    }

    public static void main(String[] args) {
        ClassDemo1 obj = new ClassDemo1().setNumber(10);
        System.out.println(obj);
    }
}
