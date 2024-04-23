package Stack_and_Queue;

import java.util.Stack;

public class _2390_Removing_Stars_From_a_String {

    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '*') {
                stack.push(c);
            } else {
                stack.pop();
            }
        }

        for (char item : stack) {
            ans.append(item);
        }


        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "erase*****";
        System.out.println(removeStars(s));
    }
}
