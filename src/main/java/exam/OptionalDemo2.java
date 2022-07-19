package exam;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalDemo2 {
    private static Optional<Double> average(Double... values) {
        if (values.length == 0) return Optional.empty();
        else {
            Double result = 0.0;
            for (Double element : values) {
                result += element;
            }
            return Optional.of(result / values.length);
        }
    }

    public static void main(String[] args) {
        Optional<Double> result = average(10.0, 20.0);
        result.ifPresent(System.out::println);
        result.orElse(Double.NaN);
        result.orElseGet(Math::random);
        result.orElseThrow();
        result.orElseThrow(NoSuchElementException::new);

    }

}

