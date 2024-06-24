package HashTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class _2404_Most_Frequent_Even_Element {
    public static int mostFrequentEven(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        int elementMax = 0;
        int index = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) > elementMax) {
                elementMax = map.get(key);
                index = key;
            }
        }
        if (map.isEmpty()) return -1;
        if (elementMax == 0) return -1;

        return index;
    }

    public static void main(String[] args) {
        int[] nums = {8267, 8727, 2649, 7359, 2142, 7824, 7399, 3424, 8868, 476, 9769, 4631, 6631, 4205, 9178, 7920, 4748, 5523, 74, 5550, 516, 6448, 3475, 7867, 7041, 5896, 4382, 2066, 8101, 674, 67, 9311, 4308, 1693, 4586, 3959, 2973, 2158, 5067, 9060, 2988, 1147, 1746, 9722, 8550, 9126, 3029, 1677, 4154, 5473, 6589, 5381, 1486, 8699, 792, 8349, 6773, 496, 4505, 6163, 6843, 1232, 4809, 4432, 6251, 7658, 4949, 1419, 7005, 3815, 6295, 4635, 7785, 4891, 6941, 6952, 7218, 134, 2718, 7409, 9551};
        System.out.println(mostFrequentEven(nums)
        );
    }

}
