package String;

import java.util.HashSet;
import java.util.Stack;

public class _3_Longest_Substring_Without_Repeating_Characters {


    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int right = 0;
        int left = 0;
        int n  = s.length();

        HashSet<Character> characterHashSet = new HashSet<>();
        while (right < n){
            if (!characterHashSet.contains(s.charAt(right))){
                characterHashSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right-left+1);  // chú ý đoạn này
                right++;
            }else {
                characterHashSet.remove(s.charAt(left));
                left++;
            }

        }
        return maxLength;
    }

    public static int lengthOfLongestSubstringWithStack(String s) {
        int n = s.length();
        int maxLength = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);

            if (stack.contains(currentChar)) {

                while (!stack.isEmpty() && stack.peek() != currentChar) {
                    stack.pop();
                }
                stack.pop();
            }

            stack.push(currentChar);
            maxLength = Math.max(maxLength, stack.size());
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String a = "abcabc";
        System.out.println(lengthOfLongestSubstring(a));
    }
}
//   Ta thấy  các kí tự không trùng nhau và nó unique
// ý tưởng ở đâu là chúng ta sài Hash set để loại bỏ những element trùng nhau xong sử dụng 2 con point để xd điểm của nó
/*Given a string s, find the length of the longest  substring without repeating characters.
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.*/