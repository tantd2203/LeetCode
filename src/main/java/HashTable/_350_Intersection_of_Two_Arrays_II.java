package HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _350_Intersection_of_Two_Arrays_II {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> listResult = new ArrayList<>();

        for (int num1 : nums1) {
            map.put(num1, map.getOrDefault(num1, 0) + 1);
        }

        map.forEach((key, value) -> System.out.println(key + " : " + value));

        for (int num2 : nums2) {

            if (map.containsKey(num2)) {
                if (map.get(num2) > 0) {
                    listResult.add(num2);
                }
                map.put(num2, map.getOrDefault(num2, 0) - 1);

            }
        }
        int[] array = listResult.stream().mapToInt(Integer::intValue).toArray();

        return array;
    }

    public static void main(String[] args) {
        int[] a = {4, 9, 5};
        int[] b = {9, 4, 9, 8, 4};
        System.out.println(intersect(a, b));
    }
}
