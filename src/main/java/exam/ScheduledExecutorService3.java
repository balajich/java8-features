package exam;

import java.util.concurrent.*;

public class ScheduledExecutorService3 {

    public static void main(final String[] arguments) throws InterruptedException, ExecutionException {
        final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

        ScheduledFuture<?> result1 = scheduler.scheduleAtFixedRate(() -> System.out.println("Beep1"), 1,1, TimeUnit.SECONDS);
        System.out.println("A am I called");
        System.out.println(result1.get());
        System.out.println("Get is called");
        scheduler.shutdown();
        System.out.println("Exited");

    }


}