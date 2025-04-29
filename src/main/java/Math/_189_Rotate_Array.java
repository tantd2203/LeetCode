package Math;

public class _189_Rotate_Array {
    public void rotate(int[] nums, int k) {
     int n = nums.length;
     k  = k % n;

     reverser(nums, 0, n - 1); // reverse ALL
     reverser(nums, 0, k - 1);// reverse left
     reverser(nums, k, n - 1); // reverse right
    }
    public void reverser(int[] nums, int s, int e) {
        while (s < e) {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
         int k = 3;
         _189_Rotate_Array t = new _189_Rotate_Array();
         t.rotate(nums, k);

         for (int i = 0; i < nums.length; i++) {
             System.out.print(nums[i] + " ");
         }
    }
}
