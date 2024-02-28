package Stack_and_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class _933_Number_of_RecentCalls {
        private Queue<Integer> queue = new LinkedList<>();

        public int ping(int t) {
            queue.add(t);

            while (queue.peek() < t - 3000) {
                queue.remove();
            }

            return queue.size();
        }

    public static void main(String[] args) {

    }
}
