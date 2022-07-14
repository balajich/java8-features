package exam;

enum Season {
    WINTER, SPRING, SUMMER, FALL
}

public class EnumDemo {
    public static void main(String[] args) {
        Season s=Season.SUMMER;
        for(Season season:Season.values()){
            System.out.println(season.name());
            System.out.println(season.ordinal());
        }
        System.out.println(Season.valueOf("SUMMER"));
        //System.out.println(exam.Season.valueOf("xyz"));// Throws Exception

    }
}
