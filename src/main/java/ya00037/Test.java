package ya00037;

public class Test {
    public static void main(String[] args) {
        print(1,2,3,4);
        print(1);
    }
    static void print(int... args){
        for(int i:args){
            System.out.println(i);
        }
    }
}

