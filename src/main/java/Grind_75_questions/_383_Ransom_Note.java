package Grind_75_questions;

import com.sun.source.tree.NewArrayTree;

import java.util.*;

public class _383_Ransom_Note {
    public static boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> r = new HashMap<>();
        HashMap<Character, Integer> m = new HashMap<>();

        // Đếm số lần xuất hiện của mỗi ký tự trong ransomNote
        for (char s : ransomNote.toCharArray()) {
            r.put(s, r.getOrDefault(s, 0) + 1);
        }

        // Đếm số lần xuất hiện của mỗi ký tự trong magazine
        for (char s : magazine.toCharArray()) {
            m.put(s, m.getOrDefault(s, 0) + 1);
        }

        // Kiểm tra từng ký tự trong ransomNote
        for (char s : r.keySet()) {
            if (r.get(s) > m.getOrDefault(s, 0)) {
                return false; // Nếu bất kỳ ký tự nào trong ransomNote không có đủ trong magazine
            }
        }

        return true; // Có thể tạo ransomNote từ magazine

    }

    public static void main(String[] args) {
        System.out.println(  canConstruct("aa", "aac"));

    }
}
