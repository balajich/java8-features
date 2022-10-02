package exam;

import java.util.concurrent.*;

public class ScheduledExecutorService2 {

    public static void main(final String[] arguments) throws InterruptedException, ExecutionException {
        final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

        ScheduledFuture<?> result1 = scheduler.schedule(() -> System.out.println("Beep1"), 1, TimeUnit.SECONDS);
        ScheduledFuture<?> result2 = scheduler.schedule(() -> System.out.println("Beep2"), 2, TimeUnit.SECONDS);

        System.out.println(result1.get());
        System.out.println(result2.get());
        scheduler.shutdown();
        System.out.println("Exited");

    }


}