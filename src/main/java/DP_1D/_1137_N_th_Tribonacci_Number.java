package DP_1D;

public class _1137_N_th_Tribonacci_Number {
    public int tribonacci(int n) {

        if (n == 0) {
            return 0;gi
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        // Initialize the first three Tribonacci numbers
        int t0 = 0, t1 = 1, t2 = 1;

        // Variable to store the next Tribonacci number
        int tn = 0;

        // Iterate to compute the n-th Tribonacci number
        for (int i = 3; i <= n; i++) {
            tn = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = tn;
        }

        return t2;

    }
}
