package Grind_75_questions;

import java.util.Stack;

public class _20_Valid_Parentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else {
                char getValue = stack.peek();
                if (stack.empty()) {
                    return false;
                }
                if ((c == ']' && getValue == '[') || (c == '}' && getValue == '{') || (c == ')' && getValue == '(')) {
                    stack.pop();
                }
            }
        }

        return stack.empty();
    }

    public static void main(String[] args) {
        String s = "()[";
        System.out.println(isValid(s));
    }
}
