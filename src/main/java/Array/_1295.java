package Array;

public class _1295 {

    public static void main(String[] args) {
        int[] nums = {555,901,4822,1771};


    }
    public static int findNumbers(int[] nums ) {
        int result = 0;
        for (int num : nums) {
            String number = String.valueOf(num);
            if (number.length() % 2 == 0) {
                result++;
            }
        }
        return  result;
    }


}
