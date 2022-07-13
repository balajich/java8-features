package exam;

class S3{
    S3(){
        System.out.println("exam.S3 Cons");
    }
}
class S4 extends S3{
    S4(){
        super();
        System.out.println("exam.S4 Cons");
    }
}
public class SuperDemo2 {
    public static void main(String[] args) {
        S4 s4= new S4();
    }
}
