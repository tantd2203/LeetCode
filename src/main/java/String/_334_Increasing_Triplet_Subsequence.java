package String;

public class _334_Increasing_Triplet_Subsequence {
    public static boolean increasingTriplet(int[] nums) {

        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= a) {
                a = num;
            } else if (num <= b) {
                b = num;
            } else {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 0, 4, 6};
        System.out.println(increasingTriplet(nums));
    }
}
