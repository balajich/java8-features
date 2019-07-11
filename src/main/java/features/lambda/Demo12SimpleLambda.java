package features.lambda;

interface MyNumber {
    double getNumber();
}

public class Demo12SimpleLambda {
    public static void main(String[] args) {
        // Here, the lambda expression is simply a constant expression.
        // When it is assigned to myNum, a class instance is
        // constructed in which the lambda expression implements
        // the getValue() method in MyNumber.
        MyNumber myNumber = () -> 10.235;
        System.out.println(myNumber.getNumber());

        myNumber = () -> Math.random() * 100;
        System.out.println(myNumber.getNumber());
        System.out.println(myNumber.getNumber());

        // A lambda expression must be compatible with the method
        // defined by the functional interface. Therefore, this won't work:
        //myNum = () -> "123.03"; // Error!
    }
}

