package Stack_and_Queue;


import java.util.Stack;

public class _394_Decode_String {
    public static String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder currStr = new StringBuilder();
        int currNum = 0;

        for (char c : s.toCharArray()) {

            //isDigit function: check if char is a number?
            if (Character.isDigit(c)) {
                currNum = currNum * 10 + (c - '0');
//                 đoạn này nếu là thì số sẽ đc cộng lại với nhau ví dụ 3+5= 35 :))
            } else if (c == '[') {
                numStack.push(currNum);
                strStack.push(currStr);
                currNum = 0;
                currStr = new StringBuilder();
            } else if (c == ']') {
                int num = numStack.pop();
                StringBuilder prevStr = strStack.pop();
                for (int i = 0; i < num; i++) {
                    prevStr.append(currStr);
                }
                currStr = prevStr;
            } else {
                currStr.append(c);
            }
        }

        return currStr.toString();
    }

    public static void main(String[] args) {
        String encodedString = "3[a]2[bc]";
        String decodedString = decodeString(encodedString);
        System.out.println(decodedString); // Output: "aaabcbc"
    }
}

