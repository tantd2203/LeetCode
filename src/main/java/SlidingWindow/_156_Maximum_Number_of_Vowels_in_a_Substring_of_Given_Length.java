package SlidingWindow;

import java.util.Arrays;

public class _156_Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length {
    public static int maxVowels(String s, int k) {

        int n = s.length();
        int count = 0;
        char[] chars = s.toCharArray();

        for (int i = 0; i < k; i++) {
            if (isVowel(chars[i])) {
                count++;
            }
        }
        int max = count;

        for (int i = k; i < n; i++) {

            if (isVowel(chars[i - k])) {
                count--;
            }

            if (isVowel(chars[i])) {
                count++;
            }

            max = Math.max(max, count);
        }

        return max;
    }

    public static boolean isVowel(char vowel) {

        if(vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u'){
            return  true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "tryhard"; int k =4;
        System.out.println(maxVowels(s,k));

    }

}