import java.util.List;
import java.util.Objects;

public class OverLoadingDemo {
    static void print(List<?> list){
        for(Object e: list){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        print(List.of(1,2,3));
        print(List.of("A","B","C"));
    }
}
