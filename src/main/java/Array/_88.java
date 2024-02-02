package Array;

import java.util.Arrays;

public class _88 {
    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0}, m = 3, nums2[] = {2,5,6};
         int n = 3;
        merge(nums1,m,nums2,n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
      int index = 0;
       for ( int  i = m ; i < nums1.length ;i++){
           nums1[i] = nums2[index];
           index ++;
       }
       Arrays.sort(nums1);
    }

}

//iead    chèn mảng num2 vào num 1 xong đó sort