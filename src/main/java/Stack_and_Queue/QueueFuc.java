package Stack_and_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueFuc {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(   queue.peek());
//        queue.poll(); queue.remove(); //  two same fuc
        queue.peek(); // view


    }
}
