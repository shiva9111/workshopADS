import java.util.LinkedList;
import java.util.Queue;
public class Queues {
    public static void main(String[] args) {
        Queue<Object> q=new LinkedList<>();
        q.offer(1);
        q.add(2);
        q.add("Hello");
        System.out.println(q);
    }
}


