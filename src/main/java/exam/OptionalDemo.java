package exam;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<Integer> result = Optional.ofNullable(null);
        System.out.println(result.isPresent());
        System.out.println(result.isEmpty());
        System.out.println(result.isPresent()?result.get():0);

    }

}

