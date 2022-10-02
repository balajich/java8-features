package ya00039;

public class Test {
static int i =10;
static{
    System.out.println(i);
    i=20;
}

    public static void main(String[] args) {
        System.out.println(Test.i);
    }

}

