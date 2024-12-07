package Interview;

import java.lang.reflect.Array;
import java.util.Arrays;

public class findThirdLargest {
    public static int findThirdLargest(int[] arr) {
        if (arr.length < 3) {
            throw new IllegalArgumentException("Array must have at least 3 elements");
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }

        return third;
    }

    public static void main(String[] args) {
        int[] arr = {12, 13, 1, 10, 34, 1};

        Arrays.parallelSort(arr);
        for (int a : arr){
            System.out.println(a);
        }
      //  System.out.println("The third largest number is: " + findThirdLargest(arr));
    }

}