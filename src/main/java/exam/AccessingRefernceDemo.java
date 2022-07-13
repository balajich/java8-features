package exam;

public class AccessingRefernceDemo {
    int i;
    public void setI(int i){
        i=i;
    }

    public static void main(String[] args) {
        AccessingRefernceDemo accessingRefernceDemo= new AccessingRefernceDemo();
        System.out.println(accessingRefernceDemo.i);//Prints 0
    }
}
