package Array;

public class _390_Find_Minimum_Operations_to_Make_All_Elements_Divisible_by_Three {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 3 != 0) count++;
        }

        return count;
    }
}
