package Array;

public class _27 {

    public static void main(String[] args) {
      int   nums[] = {3,2,2,3}, val = 3;
      int a=   removeElement(nums,val);
        System.out.println(a);
    }

    public  static  int  removeElement(int[] nums, int val) {
        int result =  0;
         for ( int  i = 0 ; i < nums.length ; i++){
             if (nums[i] != val) {
                 nums[result] = nums[i];
               result++;
             }
         }
        return  result;
    }
}
