package exam;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test extends Thread {

    List<String> list = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {
        Test t = new Test();
        t.start();

        System.out.println("in main thred");

        t.destory();

    }

    public void destory() {
//        list.stream().toArray(String[]::new);
//        System.out.println("done");
        for(String element:list){
            System.out.println(element);
        }

    }

    @Override
    public void run() {
        while(true) {
            list.add("test");
        }

    }
}