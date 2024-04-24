package Stack_and_Queue;

import java.util.Stack;

public class _20_Valid_Parentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return true;
                }
                char openPeek =  stack.peek();

                if (c == ')' && openPeek == '('
                        || c == ']' && openPeek == '['
                        || c == '}' && openPeek == '{') {
                    stack.pop();

                } else {
                    return false;
                }

            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

    }
}
