package exam;

class ThreadDemo3 {
    private static int counter = 0;

    public static void main(String[] a) throws InterruptedException {
        new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                ThreadDemo3.counter++;
            }
        }).start();
//        new Thread(() -> {
//            for (int i = 0; i < 100; i++)
//                exam.ThreadDemo3.counter++;
//        }).start();

        while (ThreadDemo3.counter < 4000) {
            System.out.println("Not reached yet");
            Thread.sleep(1000); // 1 SECOND
        }
        System.out.println("Reached!");
    }
}