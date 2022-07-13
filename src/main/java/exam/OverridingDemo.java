package exam;

class A1Ov {
    Object hello() {
        System.out.println("I am class A");
        return Integer.valueOf(0);
    }
}

class B1Ov extends A1Ov {
    @Override
    Integer hello() {
        System.out.println("I am class B");
        return Integer.valueOf(11);
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        B1Ov b1Ov= new B1Ov();
        System.out.println(b1Ov.hello());
    }
}
