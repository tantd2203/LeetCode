package String;

import java.util.ArrayList;
import java.util.List;

public class _345_Reverse_Vowels_of_a_String {
    public static String reverseVowels(String s) {
        // Chuyển đổi chuỗi sang chữ thường


        char[] chars = s.toCharArray();

        List<Integer> listIndex = new ArrayList<>();

        // Tìm vị trí của các nguyên âm
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
              ||c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'

            ) {
                listIndex.add(i);
            }
        }

        // Đảo ngược các nguyên âm
        int left = 0;
        int right = listIndex.size() - 1;
        while (left < right) {
            int leftIndex = listIndex.get(left);
            int rightIndex = listIndex.get(right);

            // Hoán đổi các nguyên âm
            char temp = chars[leftIndex];
            chars[leftIndex] = chars[rightIndex];
            chars[rightIndex] = temp;

            left++;
            right--;
        }

        // Tạo chuỗi kết quả
        StringBuilder result = new StringBuilder();
        for (char a : chars) {
            result.append(a);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String a = "leetcode";
        System.out.println(reverseVowels(a));
    }
}
