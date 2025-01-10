package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class _916_Word_Subsets {
    public static List<String> wordSubsets(String[] words1, String[] words2) {
        // Tạo bảng tần suất ký tự tổng hợp từ words2
        int[] maxFreq = new int[26];
        for (String word : words2) {
            int[] freq = countFrequency(word);
            for (int i = 0; i < 26; i++) {
                maxFreq[i] = Math.max(maxFreq[i], freq[i]);
            }
        }

        // Kiểm tra từng từ trong words1
        List<String> result = new ArrayList<>();
        for (String word : words1) {
            int[] freq = countFrequency(word);
            boolean isUniversal = true;

            for (int i = 0; i < 26; i++) {
                if (freq[i] < maxFreq[i]) {
                    isUniversal = false;
                    break;
                }
            }

            if (isUniversal) {
                result.add(word);
            }
        }

        return result;
    }

    // Hàm trợ giúp: Đếm tần suất ký tự trong một từ
    private static int[] countFrequency(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }

    public static void main(String[] args) {
        String[] words1 = {"amazon", "apple", "facebook", "google", "leetcode"};
        String[] words2 = {"oo", "e"};
        System.out.println(wordSubsets(words1, words2));


    }
}
