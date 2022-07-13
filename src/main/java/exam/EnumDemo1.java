package exam;

enum DAYS1{
    SUNDAY,MONDAY,TUESDAY
}
public class EnumDemo1 {
    public static void main(String[] args) {
        DAYS1 days1=DAYS1.MONDAY;
        System.out.println(days1);
        switch(days1){
            default:
                System.out.println("Unknown Day");
                break;
            case MONDAY:
                System.out.println("Monday");
                break;

        }//end of switch
    }
}
