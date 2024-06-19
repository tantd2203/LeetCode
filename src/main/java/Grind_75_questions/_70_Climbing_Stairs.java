package Grind_75_questions;

public class _70_Climbing_Stairs {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int first = 1;
        int second = 2;
        int third = 0;

        for (int i = 3; i <= n; i++) {
            third = first + second;
            first = second;
            second = third;
        }

        return third;
    }

    public static void main(String[] args) {
        _70_Climbing_Stairs solution = new _70_Climbing_Stairs();
        int n = 5; // Example input
        System.out.println("Number of ways to climb " + n + " steps: " + solution.climbStairs(n));
    }

}
