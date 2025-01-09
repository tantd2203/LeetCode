package Array;

import java.util.Arrays;

public class _14_Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Sort the array of strings lexicographically
        Arrays.parallelSort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        StringBuilder prefix = new StringBuilder();

        // Find the common prefix between the first and the last string
        for (int i = 0; i < first.length(); i++) {
            if (i < last.length() && first.charAt(i) == last.charAt(i)) {
                prefix.append(first.charAt(i));
            } else {
                break;
            }
        }

        return prefix.toString();
    }
}
