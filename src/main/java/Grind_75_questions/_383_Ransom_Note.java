package Grind_75_questions;

import com.sun.source.tree.NewArrayTree;

import java.util.*;

public class _383_Ransom_Note {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> r = new HashMap<>();
        Map<Character, Integer> m = new HashMap<>();

        for (char ra : ransomNote.toCharArray()) {

            r.put(ra, r.getOrDefault(ra, 0) + 1);

        }
        for (char ma : magazine.toCharArray()) {

            m.put(ma, m.getOrDefault(ma, 0) + 1);

        }

        for (char s : r.keySet()) {
            if (r.get(s) > m.getOrDefault(s,0)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aac"));

    }
}
