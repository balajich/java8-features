package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class DemoThread3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(1000);
                return "Hello World";
            }
        };
        ExecutorService service = Executors.newSingleThreadExecutor();
        List<Future<String>> futures= new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Future<String> future = service.submit(callable);
            futures.add(future);
        }
        for(Future future:futures){
            System.out.println(future.get());
        }
        service.shutdown();//Blocks all the calls
        System.out.println("End of main");

    }
}
