package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrencyDemo1 {
    private List<Double> randomNumbers = new ArrayList<>();

    private  void append() {
        for(int i=0;i<100;i++)
        randomNumbers.add(Math.random());
    }
    private void remove(){
        randomNumbers.remove(0);
    }

    private void print(){
        for(Double randomNumber: randomNumbers){
            System.out.println(randomNumber);
        }
    }

    public static void main(String[] args) {
        ExecutorService service = null;
        ConcurrencyDemo1 manager = new ConcurrencyDemo1();
        try {
            service = Executors.newFixedThreadPool(2000);
            for (int i = 0; i <100; i++) {
                if(i%2==0) {
                    service.submit(() -> manager.append());
                    service.submit(() -> manager.print());
                }else {
                    service.submit(() -> manager.print());
                    service.submit(() -> manager.remove());

                }
            }// end of for


        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
        System.out.println(manager.randomNumbers);
    }
}