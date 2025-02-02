
package Array;

public class _3151_Special_Array_I {
    public static boolean isArraySpecial(int[] nums) {
        if (nums == null || nums.length < 2) {
            return true;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] % 2 == nums[i + 1] % 2) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] a = {1, 2};

        System.out.println(isArraySpecial(a));
    }
}
