
package HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _49_Group_Anagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String wordSorted =   new String(charArray);
            if (map.containsKey(wordSorted)) {
                map.get(wordSorted).add(word);
            }else {
                List<String> groups = new ArrayList<>();
                groups.add(word);
                map.put(wordSorted,groups);
            }
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] wordList = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> groupedAnagrams = groupAnagrams(wordList);

        for (List<String> group : groupedAnagrams) {
            System.out.println(group);
        }
    }

}
