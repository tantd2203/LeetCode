package Stack_and_Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _735_Asteroid_Collision {

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            // Handle positive asteroids directly
            if (asteroid > 0) {
                stack.push(asteroid);
            } else {
                // Handle negative asteroids
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroid)) {
                    stack.pop(); // Destroy the smaller positive asteroid
                }
                if (!stack.isEmpty() && stack.peek() == Math.abs(asteroid)) {
                    stack.pop(); // Destroy both asteroids if they are of equal size
                } else if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(asteroid); // Push the negative asteroid onto the stack
                }
            }
        }

        // Convert stack to result array
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }


    public static void main(String[] args) {
        int[] asteroids = {-2, -1, 1, 2};
        int[] a = asteroidCollision(asteroids);

        for (int c : a) {
            System.out.println(c);
        }


    }
}
