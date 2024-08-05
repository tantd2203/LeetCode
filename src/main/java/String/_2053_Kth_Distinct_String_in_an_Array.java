package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _2053_Kth_Distinct_String_in_an_Array {
    public static String kthDistinct(String[] arr, int k) {
        // Step 1: Count occurrences of each string
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        // Step 2: Collect strings that appear exactly once
        List<String> distinctList = new ArrayList<>();
        for (String s : arr) {
            if (map.get(s) == 1) {
                distinctList.add(s);
            }
        }

        // Step 3: Return the k-th distinct string if available
        if (k <= distinctList.size()) {
            return distinctList.get(k - 1);
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        // Example test cases
        String[] arr1 = {"a", "b", "a", "c", "b", "d"};
        int k1 = 2;
        System.out.println(kthDistinct(arr1, k1)); // Output: "d"

        String[] arr2 = {"a", "b", "c", "a", "b", "c", "d"};
        int k2 = 1;
        System.out.println(kthDistinct(arr2, k2)); // Output: "d"

        String[] arr3 = {"a", "a", "a", "a"};
        int k3 = 1;
        System.out.println(kthDistinct(arr3, k3)); // Output: ""
    }
}
