package String;

import java.util.Arrays;

public class _2185_Counting_Words_With_a_Given_Prefix {
    public static int prefixCount(String[] words, String pref) {
        int count = 0;


        for (String item : words) {

            if (item.startsWith(pref)) {
                count++;
            }

        }


        return count;
    }

    public static void main(String[] args) {
        String[] words = {"pay", "attention", "practice", "attend"};
        String pref = "at";

        System.out.println(prefixCount(words, pref));
    }
}
