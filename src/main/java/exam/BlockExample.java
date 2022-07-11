package exam;

public class BlockExample {
    int i;

    public BlockExample(){
        System.out.println("Constructor Initializer");
    }

    public static void main(String[] args) {
        BlockExample b= new BlockExample();
        System.out.println(b);
        BlockExample b1= new BlockExample();
        System.out.println(b1);
    }
    {
        System.out.println("Instance initialize");
    }
}
