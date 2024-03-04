package String;

public class _1768_Merge_Strings_Alternately {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder merge = new StringBuilder();
        int j = 0;
        int i = 0;

        while (i < word1.length() && j < word2.length()) {
            merge.append(word1.charAt(i++));
            merge.append(word2.charAt(j++));
        }

        merge.append(word1.substring(i));
        merge.append(word2.substring(j));
        return String.valueOf(merge);
    }
}
