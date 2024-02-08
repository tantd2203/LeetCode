package BinarySearch;

public class BinarySearch_v2 {

    public static int binary_search(int[] array, int val) {
        int n = array.length;
        return binary_search(array, val, 0, n - 1);
    }

    public static int binary_search(int[] array, int val, int left, int right) {

        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;

        if (val == array[mid]) {
            return mid;
        } else if (val > array[mid]) {
            return binary_search(array, val, mid + 1, right);

        } else {
            return binary_search(array, val, left, mid - 1);
        }

    }


    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(binary_search(a, 7));
    }
}
