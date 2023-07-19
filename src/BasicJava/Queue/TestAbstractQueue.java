package BasicJava.Queue;

import java.util.AbstractQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TestAbstractQueue {

    public static void main(String[] args) {
        AbstractQueue<Integer> abstractQueue = new LinkedBlockingQueue<>();
        // Adding elements to the Queue
        abstractQueue.add(10);
        abstractQueue.add(20);
        abstractQueue.add(30);
        abstractQueue.add(40);
        abstractQueue.add(50);
        for (int num : abstractQueue) {
            System.out.println(num);
        }
    }
}
