package exam;

public class VarArgDemo {
    public static void main(String[] args) {
        print(new int[]{1,2});
        print(new int[2]);
        print(1,2);
    }
    public static void print(int... arr){
        for(int i:arr)
            System.out.println(i);
    }
}
