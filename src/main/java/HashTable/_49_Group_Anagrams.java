package HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _49_Group_Anagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> anagrams = new HashMap<>();

        for (String word : strs) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortWord = new String(charArray);

            if (anagrams.containsKey(sortWord)) {
                anagrams.get(sortWord).add(word);
            } else {
                List<String> group = new ArrayList<>();
                group.add(word);
                anagrams.put(sortWord, group);
            }

        }

        return new ArrayList<>(anagrams.values());
    }

    public static void main(String[] args) {
        String[] wordList = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> groupedAnagrams = groupAnagrams(wordList);

        for (List<String> group : groupedAnagrams) {
            System.out.println(group);
        }
    }

}
