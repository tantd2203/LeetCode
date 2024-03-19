package TwoPointers;

import java.util.ArrayList;
import java.util.List;

public class _392_Is_Subsequence {
    public static boolean isSubsequence(String s, String t) {

        int tPoint = 0;
        int sPoint = 0;

        while (tPoint < t.length() && sPoint < s.length()) {
            if (s.charAt(sPoint) == t.charAt(tPoint)) {
                sPoint++;
            }
            tPoint++;
        }


        return sPoint == s.length();
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbsc";
        System.out.println("Is \"" + s + "\" a subsequence of \"" + t + "\"? " + isSubsequence(s, t));
    }
}
