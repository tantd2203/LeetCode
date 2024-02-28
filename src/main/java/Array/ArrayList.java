package Array;

import java.util.List;

public class ArrayList {

    public static int findMax(int[] a) {

        int n = a.length; //   só phần tử của mảng

        int max = a[0];

        for (int i = 1; i < n; i++) {

            if (max < a[i]) {
                max = a[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 2, 7, 3};

        int result = findMax(arr);
        System.out.println( result);
    }
}