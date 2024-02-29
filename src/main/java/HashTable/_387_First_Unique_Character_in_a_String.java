package HashTable;

import java.util.HashMap;
import java.util.Map;

public class _387_First_Unique_Character_in_a_String {
    public int firstUniqChar(String s) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c) == false) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1); // put  phần tử đã có trong map và cộng value thêm 1
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.get(c) == 1) {
                return i;
            }
        }

        return -1;
    }
}
