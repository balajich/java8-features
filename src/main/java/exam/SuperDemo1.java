package exam;

class S1 {
    int i = -1;

    void display() {
        System.out.println(i);
    }

}

class S2 extends S1 {
    int i;

    void display() {
        System.out.println(i);
        System.out.println(super.i);
        super.display();
    }

}

public class SuperDemo1 {
    public static void main(String[] args) {
        S2 s2 = new S2();
        s2.display();
    }
}
