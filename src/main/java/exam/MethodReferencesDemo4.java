package exam;

import java.util.function.*;

class MRUtil {
    public static int findLength(String ... args){
        System.out.println(args.length);
        return  args.length;
    }
}
public class MethodReferencesDemo4 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(MRUtil.findLength());

        Supplier<Integer> integerSupplier= MRUtil::findLength;
        System.out.println(integerSupplier.get());

        Consumer<String> consumer= MRUtil::findLength;
        consumer.accept("A");

        Function<String,Integer> function= MRUtil::findLength;
        function.apply("A");

        BiFunction<String,String,Integer> biFunction= MRUtil::findLength;
        biFunction.apply("A","B");
    }
}
