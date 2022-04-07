package 剑指offer;

import java.util.Deque;
import java.util.LinkedList;

public class JZ30 {

}

class MinStack {

    private Deque<Integer> stack1, stack2;

    /** initialize your data structure here. */
    public MinStack() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void push(int x) {
        stack1.push(x);
        if (stack2.isEmpty() || stack2.peek() >= x)
            stack2.push(x);
    }

    public void pop() {
        if (stack1.pop().equals(stack2.peek()))
            stack2.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }
}
