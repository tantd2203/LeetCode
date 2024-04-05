package SlidingWindow;


//
public class _643_Maximum_Average_Subarray_I {

    public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double sum = 0;
        // Tính tổng của k phần tử đầu tiên
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxAvg = sum / k;

        // Di chuyển cửa sổ trượt
        for (int i = k; i < n; i++) {
            sum += nums[i] - nums[i - k]; // Thêm phần tử mới và loại bỏ phần tử cũ
            double avg = sum / k;
            maxAvg = Math.max(maxAvg, avg);
        }

        return maxAvg;
    }

    public static void main(String[] args) {
        int [] nums = {1,12,-5,-6,50,3};
        int k = 93;
        System.out.println(findMaxAverage(nums, 4));
    }

}
