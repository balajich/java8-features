package exam;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue= new LinkedList<>();
        queue.add(10);
        queue.add(11);
        queue.add(12);
        System.out.println(queue.offer(13));
        System.out.println(queue.offer(14));
        System.out.println(queue.offer(13));
        queue.forEach(System.out::println);
        System.out.println("Peek: "+queue.peek());//returns next element
        System.out.println("Peek: "+queue.peek());//returns next element
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
