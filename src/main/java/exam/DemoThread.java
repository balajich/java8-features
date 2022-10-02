package exam;

public class DemoThread {
    public static void main(String[] args) {
        Runnable r= new Runnable() {
            @Override
            public void run() {
                System.out.println("I am child");
            }
        };
        Thread t= new Thread(r);
        t.start();
        System.out.println("Main Exited");

    }

}
