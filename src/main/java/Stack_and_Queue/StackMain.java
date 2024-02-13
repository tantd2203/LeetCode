package Stack_and_Queue;

import java.util.Map;

public class StackMain {
    public static void main(String[] args) {
        int size = 3;
        MyArrayStack myStack = new MyArrayStack(size);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.print();
        System.out.println(   myStack.pop());
        myStack.print();
    }
}
