package String;

public class _28_Find_the_Index_of_the_First_Occurrence_in_a_String {
    public  static int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();

        // Edge case: if needle is empty, return 0
        if (nLen == 0) {
            return 0;
        }

        // Iterate over the haystack
        for (int i = 0; i <= hLen - nLen; i++) {
            // Check if the substring of haystack starting from i matches needle
            int j;
            for (j = 0; j < nLen; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            // If the inner loop didn't break, it means we found the needle
            if (j == nLen) {
                return i;
            }
        }
        // If we reach here, needle was not found in haystack
        return -1;
    }

    public static void main(String[] args) {
        // Create an instance of the Main class to call the strStr method

        // Test cases
        String haystack1 = "hello";
        String needle1 = "ll";
        System.out.println("Index of '" + needle1 + "' in '" + haystack1 + "': " + strStr(haystack1, needle1));

        String haystack2 = "aaaaa";
        String needle2 = "bba";
        System.out.println("Index of '" + needle2 + "' in '" + haystack2 + "': " + strStr(haystack2, needle2));

    }
}
