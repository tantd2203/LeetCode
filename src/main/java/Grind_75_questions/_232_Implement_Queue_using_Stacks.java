package Grind_75_questions;

import java.util.Stack;

public class _232_Implement_Queue_using_Stacks {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> val = new Stack<>();

    public _232_Implement_Queue_using_Stacks() {

    }

    private Stack<Integer> first = new Stack<>();
    private Stack<Integer> second = new Stack<>();

    private int front;

    public void push(int x) {
        if(first.isEmpty()){
            front = x;
        }
        first.push(x);
    }

    public int pop() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int removed = second.peek();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }

    public boolean empty() {
        return first.isEmpty();
    }
}
