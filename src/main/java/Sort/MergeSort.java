package Sort;

public class MergeSort {


//    Recursive

    public static int[] mergeSort(int[] nums, int Left, int Right) {

//         chia  các phần tử
        if (Left > Right) return new int[0];
        if (Left == Right) {
            return new int[]{nums[Left]};
        }
        int k = (Left + Right) / 2;
        int[] l1 = mergeSort(nums, Left, k);
        int[] l2 = mergeSort(nums, k + 1, Right);
        System.out.println("Chia" + Left + "-" + Right);
//        merge các phần tử lai
        return  merge(l1, l2);
    }

    private static int[] merge(int[] l1, int[] l2) {
        int n = l1.length + l2.length;
        int[] result = new int[n];
        int i = 0, i1 = 0, i2 = 0;
        while (i < n) {
            if (i1 < l1.length && i2 < l2.length) {  // l1 and l2 !=null
                if (l1[i1] <= l2[i2]) {
                    result[i] = l1[i1];
                    i++;
                    i1++;
                } else {
                    result[i] = l2[i2];
                    i++;
                    i2++;
                }
            } else {  // L1 or L2  == null
                if (i1 < l1.length) { // L1 !=Null
                    result[i] = l1[i1];
                    i++;
                    i1++;
                } else {  //L2 != null
                    result[i] = l2[i2];
                    i++;
                    i2++;
                }
            }
        }
        return result;
    }

    public static   int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }


    public static void main(String[] args) {
      int []  nums = {5,2,3,1};
        int [] result =  sortArray(nums);


        for ( int i : result){
            System.out.print(i+ "");
        }

    }

//    ý tưởng merge sort :  băm nhỏ mảng thành các phần tử  rồi trộn chúng lại với nhau
}
