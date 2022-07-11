package exam;

public class ConstructionOrder {
    int number=5;
    public ConstructionOrder(){
        System.out.println("In constructor"+number);
        number=4;
    }
    {
        System.out.println("In initializer"+number);
        number=6;

    }


    public static void main(String[] args) {
        ConstructionOrder c=new ConstructionOrder();
        System.out.println(c.number);
    }

}
