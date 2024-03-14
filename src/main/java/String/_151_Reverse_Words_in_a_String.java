package String;

import java.util.Arrays;

public class _151_Reverse_Words_in_a_String {
    public static String reverseWords(String s) {

        String[] words = s.trim().split("\\s+");
        // Key in Reverse Words in a String with keyword trim() remove space in head and tail of String
        // split (\\s+)  filter space and multiple space

        StringBuilder reversedSentence = new StringBuilder();
//
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i != 0) {
                reversedSentence.append(" ");
            }

        }
        return reversedSentence.toString();
    }
    public static void main(String[] args) {
    }
}
