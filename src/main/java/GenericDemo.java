
public class GenericDemo {
    static interface  Operation<T> {
        T operate(T arg1,T arg2);
    }

    public static void main(String[] args) {
        Operation<String> operationString= (x,y) ->x+y;
        Operation<Integer> operationInteger= (x,y) ->x+y;
        System.out.println(operationInteger.operate(10,20));
        System.out.println(operationString.operate("a","b"));
    }
}
