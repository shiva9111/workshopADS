import java.util.Collections;
import java.util.PriorityQueue;
public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.offer(5);
        pq.remove(1);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
    }
}
