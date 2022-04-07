package 剑指offer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class JZ09 {
    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(1);
        cQueue.appendTail(2);
        System.out.println(cQueue.stack1);
        System.out.println(cQueue.deleteHead());
        cQueue.appendTail(3);
        System.out.println(cQueue.deleteHead());
    }
}

class CQueue {
//    Stack<Integer> stack1;
//    Stack<Integer> stack2;
//    public CQueue() {
//        stack1 = new Stack();
//        stack2 = new Stack();
//    }
//
//    public void appendTail(int value) {
//        stack1.push(value);
//    }
//
//    public int deleteHead() {
//        while(!stack1.empty()){
//            stack2.push(stack1.pop());
//        }
//        System.out.println(stack2);
//        int result = stack2.pop();
//        while(!stack2.empty()){
//            stack1.push(stack2.pop());
//        }
//        return result;
//    }
Deque<Integer> stack1;
    Deque<Integer> stack2;
    public CQueue() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        stack1.add(value);
    }

    public int deleteHead() {
        while (!stack1.isEmpty()){
            stack2.add(stack1.pop());
        }
        if (stack2.isEmpty()) return -1;
        else {
            return stack2.pop();
        }
    }
}
