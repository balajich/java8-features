package exam;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo6 {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            for (int i = 0; i < 100; i += 2) System.out.println(i);
        };
        Runnable task2 = () -> {
            for (int i = 1; i < 100; i += 2) System.out.println(i);
        };
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.execute(task1);
        service.execute(task2);
        service.shutdown();
        System.out.println("Main exited");
    }
}