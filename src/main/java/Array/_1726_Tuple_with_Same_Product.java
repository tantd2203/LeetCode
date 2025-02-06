package Array;

import java.util.HashMap;
import java.util.Map;

public class _1726_Tuple_with_Same_Product {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> productCount = new HashMap<>();
        int result = 0;

        // Iterate over all unique pairs
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];

                // For every existing pair with the same product,
                // we can form 8 new tuples (4! / 2! since we have two pairs)
                result += productCount.getOrDefault(product, 0) * 8;

                // Increment the count of this product
                productCount.put(product, productCount.getOrDefault(product, 0) + 1);
            }
        }

        return result;
    }
}
