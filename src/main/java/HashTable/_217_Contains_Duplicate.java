
package HashTable;


import java.util.HashSet;
import java.util.Set;

public class _217_Contains_Duplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            if (set.contains(n) == true) {
                return true;
            } else {
                set.add(n);
            }
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
