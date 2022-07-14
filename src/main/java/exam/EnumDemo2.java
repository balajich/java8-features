package exam;

enum Height2{
    SMALL(0),MEDIUM(1),LARGE(2);
    private final int size;
    private Height2(int size){
        this.size=size;
    }
    public int getSize(){
        return size;
    }

}
public class EnumDemo2 {
    public static void main(String[] args) {
        Height2 height=Height2.SMALL;
        System.out.println(height.getSize());
    }
}
