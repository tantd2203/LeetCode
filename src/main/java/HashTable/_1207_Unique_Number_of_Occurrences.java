package HashTable;

import java.util.Arrays;
import java.util.HashSet;

public class _1207_Unique_Number_of_Occurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<>();
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]) {
                count++;
            } else {
                if (set.contains(count)) {
                    return false;
                }
                set.add(count);
                count = 1;
            }
        }
        if (set.contains(count)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        _1207_Unique_Number_of_Occurrences test = new _1207_Unique_Number_of_Occurrences();
        int[] arr = {1, 2, 2, 1, 1, 3};
        System.out.println(test.uniqueOccurrences(arr));
    }
}
