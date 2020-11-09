import java.util.PriorityQueue;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        java.util.PriorityQueue<Integer> priorityQueue=new PriorityQueue();
        Random random=new Random();
        for (int i = 0; i < 20; i++) {
            priorityQueue.offer(random.nextInt(1000));
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(priorityQueue.poll());
        }
    }


}
