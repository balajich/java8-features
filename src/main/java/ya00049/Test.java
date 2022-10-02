package ya00049;
enum DAYS{
    SUNDAY(0),MONDAY(8),TUESDAY(4);
     private final int hours;
    private DAYS(int hours){
        this.hours=hours;
    }
    public int getWorkingHours(){
        return this.hours;
    }

}

public class Test {
    public static void main(String[] args) {
        System.out.println(DAYS.MONDAY);
        System.out.println(DAYS.values());
        for(DAYS day:DAYS.values()){
            System.out.println(day.name());
            System.out.println(day.ordinal());
        }
        System.out.println(DAYS.valueOf("MONDAY"));

        DAYS day = DAYS.MONDAY;
        switch (day){
            case MONDAY:
                System.out.println("Working day and working hours: "+ DAYS.MONDAY.getWorkingHours());
                break;
            case SUNDAY:
                System.out.println("Holiday");
                break;
            case TUESDAY:
                System.out.println("Doesnt work");
                break;
            default:
                System.out.println("Hmm working day");

        }

    }
}

