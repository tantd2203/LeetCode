package PrefixSum;

public class _724_Find_Pivot_Index {
    public int pivotIndex(int[] nums) {
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < nums.length; i++) {
            sumRight += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                sumLeft += nums[i - 1];
            }
            sumRight = sumRight - nums[i];
            if (sumLeft == sumRight) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        _724_Find_Pivot_Index test = new _724_Find_Pivot_Index();
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(test.pivotIndex(nums));
    }
}
