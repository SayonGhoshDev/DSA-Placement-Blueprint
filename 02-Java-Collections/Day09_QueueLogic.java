import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;

public class Day09_QueueLogic {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12);
        queue.offer(24);
        System.out.println("Queue: " + queue);
        System.out.println("Polled Element: " + queue.poll());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        System.out.println("PriorityQueue: " + pq);
    }
}