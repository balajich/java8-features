package exam;

import java.util.function.Supplier;

public class SupplierConsumerDemo {
    public static void main(String[] args) {
        Supplier<Double> randomGenerator = () -> Math.random();
        Supplier<Double> staticGenerator = () -> 22.2;
        print(randomGenerator);
        print(staticGenerator);
        print(randomGenerator);
    }
    private static void print(Supplier<Double> generator){
        System.out.println(generator.get());
    }
}
