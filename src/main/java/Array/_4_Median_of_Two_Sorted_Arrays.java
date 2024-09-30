package Array;

public class _4_Median_of_Two_Sorted_Arrays {


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int [] mergeTwoArrays = mergeTwoArrays(nums1, nums2);
         int n = mergeTwoArrays.length;
         int mid = n/2;
         if (n%2 ==0){
             return (mergeTwoArrays[mid-2] + mergeTwoArrays[mid])/2.0;
         }else {
             return mergeTwoArrays[mid];
         }

    }

    public static void main(String[] args) {
            int [] nums1 ={1,3,5};
            int [] nums2 ={2,4,6};
            System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static int[] mergeTwoArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;
        int[] result = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }
        while (i < n) {
            result[k++] = nums1[i++];
        }
        while (j < m) {
            result[k++] = nums2[j++];
        }

        return result;
    }


}
