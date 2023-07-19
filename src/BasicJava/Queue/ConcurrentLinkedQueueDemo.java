package BasicJava.Queue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueDemo {

    public static void main(String[] args) {
        ConcurrentLinkedQueue<Integer>
                clq = new ConcurrentLinkedQueue<Integer>();

        clq.add(12);
        clq.add(70);
        clq.add(1009);
        clq.add(475);
        // Displaying the existing  ConcurrentLinkedQueue
        System.out.println("ConcurrentLinkedQueue: "
                + clq);

        // Create a ConcurrentLinkedQueue
        // using ConcurrentLinkedQueue(Collection c)
        // constructor
        ConcurrentLinkedQueue<Integer>
                clq1 = new ConcurrentLinkedQueue<Integer>(clq);

        // Displaying the existing  ConcurrentLinkedQueue
        System.out.println("ConcurrentLinkedQueue1: "
                + clq1);
    }
}
