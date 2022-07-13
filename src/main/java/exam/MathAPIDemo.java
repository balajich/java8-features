package exam;

public class MathAPIDemo {
    public static void main(String[] args) {
        System.out.println(Math.min(10,20));
        System.out.println(Math.min(10,-8));
        System.out.println(Math.max(-1,-5));

        System.out.println(Math.round(10.9));

        //Some attention
        System.out.println(Math.round(10.45));
        System.out.println(Math.round(10.50));
        System.out.println(Math.round(10.45f));

        //Power or exponents
        System.out.println(Math.pow(2,5));

        //Random
        System.out.println(Math.random());//Generates Random
    }
}
