package Stack_and_Queue;

import java.util.Stack;

public class _1190_Reverse_Substrings_Between_Each_Pair_of_Parentheses {
    public static String reverseParentheses(String s) {
        Stack<Integer> openParenthesesIndices = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (char currentChar : s.toCharArray()) {
            if (currentChar == '(') {
                openParenthesesIndices.push(result.length());
            } else if (currentChar == ')') {
                int start = openParenthesesIndices.pop();
                reverse(result, start, result.length() - 1);
            } else {
                // Append non-parenthesis characters to the processed string
                result.append(currentChar);
            }
        }


        return result.toString();
    }

    private static void reverse(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start++, sb.charAt(end));
            sb.setCharAt(end--, temp);
        }
    }

    public static void main(String[] args) {
        String s = "(u(love)i)";
        System.out.println(reverseParentheses(s));
    }
}
