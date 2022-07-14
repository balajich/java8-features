package exam;

class CAD4 {
    @Deprecated
    void show() {
        System.out.println("Hello! I am deprecated");
    }
}

public class CommonAnnotationDemo4 {
    @SuppressWarnings("deprecation")
    public void hello() {
        CAD4 cad4 = new CAD4();
        cad4.show();
    }

    public static void main(String[] args) {
        CommonAnnotationDemo4 commonAnnotationDemo4= new CommonAnnotationDemo4();
        commonAnnotationDemo4.hello();
    }
}
