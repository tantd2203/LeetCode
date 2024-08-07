package HashTable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

    public class _1657_Determine_if_Two_Strings_Are_Close {

    public static boolean closeStrings(String word1, String word2) {
        var map1 = new int[26];
        var map2 = new int[26];

        for (var c : word1.toCharArray()) map1[c - 'a']++;
        for (var c : word2.toCharArray()) map2[c - 'a']++;

        for (var i=0; i<26; i++) {
            if (map1[i] == 0 && map2[i] != 0) return false;
            if (map1[i] != 0 && map2[i] == 0) return false;
        }
        Arrays.sort(map1);
        Arrays.sort(map2);

        return Arrays.equals(map1, map2);
    }

    public static void main(String[] args) {
        String word1 = "abc", word2 = "bca";
        System.out.println(closeStrings(word1, word2));
    }
}
