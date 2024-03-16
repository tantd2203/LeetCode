package String;

public class _238_Product_of_Array_Except_Self {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = 1;

        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        right[n-1] = 1;
        for (int i = n - 2; i >= 0; i--) {
             right[i] = right[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            result[i] = left[i] * right[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 1, 0, -3, 3};
        int[] result = productExceptSelf(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
