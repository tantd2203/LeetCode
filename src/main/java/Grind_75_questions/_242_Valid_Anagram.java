package Grind_75_questions;

import java.util.Arrays;

public class _242_Valid_Anagram {
    public static boolean isAnagram(String s, String t) {

        char[] t1 = t.toCharArray();
        char[] s1 = s.toCharArray();
        Arrays.sort(t1);
        Arrays.sort(s1);
        String result1 = new String(t1);
        String result2 = new String(s1);

        return result2.equals(result1) ? true : false;
    }

    public static void main(String[] args) {
       String s = "anagram", t = "nagaram";
       isAnagram(s,t);
    }
}
