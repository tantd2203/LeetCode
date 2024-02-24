package Math;

public class _2413_Smallest_Even_Multiple {
    public int smallestEvenMultiple(int n) {
        int lcm = (2 * n) / gcd(2, n);
        return lcm;

    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
