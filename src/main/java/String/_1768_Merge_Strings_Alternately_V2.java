package String;

public class _1768_Merge_Strings_Alternately_V2 {
    public static String mergeAlternately(String word1, String word2) {

        StringBuilder result = new StringBuilder();
        int length = word1.length() < word2.length() ? word1.length() : word2.length(); //

        int i;
        for (i = 0; i < length; i++) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }

        if ( length == word1.length()){
            for (int j = i; j < word2.length() ; j++) {
                 result.append(word2.charAt(j));
            }
        }else {
            for (int j = i; j < word1.length() ; j++) {
                result.append(word1.charAt(j));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String word1 = "abcd", word2 = "pqsadsadas";
        System.out.println(mergeAlternately(word1, word2));
    }
}
