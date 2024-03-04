package String;

public class _1768_Merge_Strings_Alternately {
    public static String mergeAlternately(String word1, String word2) {

        StringBuilder merge = new StringBuilder();
        int i = 0;
        int j =0;

        while (i < word1.length() && j < word2.length()) {
            merge.append(word1.charAt(i++));
            merge.append(word2.charAt(j++));
        }

        merge.append(word1.substring(i));
        merge.append(word2.substring(j));
        return String.valueOf(merge);
    }

    public static void main(String[] args) {
        String word1 = "abcd", word2 = "pq";
        System.out.println(mergeAlternately(word1,word2));
    }
}
