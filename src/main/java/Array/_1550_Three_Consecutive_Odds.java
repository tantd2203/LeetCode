package Array;

public class _1550_Three_Consecutive_Odds {
    public static boolean threeConsecutiveOdds(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            if (
                    i < arr.length - 2
            ) {
                if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) return true;

            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,34,3,4,5,7,23,12};
        System.out.println(threeConsecutiveOdds(arr));

    }


}
