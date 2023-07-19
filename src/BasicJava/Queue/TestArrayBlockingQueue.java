package BasicJava.Queue;

import java.util.concurrent.ArrayBlockingQueue;

public class TestArrayBlockingQueue {

    public static void main(String[] args) {
        int capacity =15;
        ArrayBlockingQueue<Integer> arrayBlockingQueue= new ArrayBlockingQueue<>(capacity);
        // add  numbers
        arrayBlockingQueue.add(5);
        arrayBlockingQueue.add(2);
        arrayBlockingQueue.add(3);

        // print queue
        System.out.println("ArrayBlockingQueue:" + arrayBlockingQueue.size());

    }
}
