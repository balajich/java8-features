package exam;

import java.util.function.Consumer;

public class LambdaLocalVariables {
    public static void main(String[] args) {
        LambdaLocalVariables lambdaLocalVariables= new LambdaLocalVariables();
        lambdaLocalVariables.caw("Happy");
    }
    private String color;
    public void caw(String name){
        String volume="loudly";
        Consumer<String> consumer = s -> System.out.println(s+volume + color);
        consumer.accept("Hello");
    }

}
