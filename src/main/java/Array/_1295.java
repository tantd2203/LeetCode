package Array;

public class _1295 {

    public static void main(String[] args) {
        int nums[] = {555,901,4822,1771};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums ) {
        int result = 0;
        for (int i= 0 ; i < nums.length ;i ++){
            String number = String.valueOf(nums[i]);
            if (number.length() %2==0){
                result ++;
            }
        }
        return  result;
    }


}
