package HashTable;

import java.util.HashMap;
import java.util.Map;

public class _205_Isomorphic_Strings {

    public boolean isIsomorphic(String s, String t) {


        if (s.length() != t.length()) return false;
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {

            if (!mapS.containsKey(s.charAt(i))) {
                mapS.put(s.charAt(i), i);
            }

            if (!mapT.containsKey(t.charAt(i))) {
                mapT.put(t.charAt(i), i);
            }

            // check
            if (!mapS.get(s.charAt(i)).equals(mapT.get(t.charAt(i)))) {

                return false;
            }
        }

        return true;
    }
}
