package Leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class Leetcode385 {
    // 不太好理解，看的题解
    public NestedInteger deserialize(String s) {
        if (s.charAt(0) != '[') {
            return new NestedInteger(Integer.parseInt(s));
        }
        boolean isNegative = false;
        String temp = "";
        Deque<NestedInteger> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-') {
                isNegative = true;
            } else if (Character.isDigit(s.charAt(i))) {
                temp += s.charAt(i);
            } else if (s.charAt(i) == '['){
                stack.push(new NestedInteger());
            } else if (s.charAt(i) == ',' || s.charAt(i) == ']') {
                if (Character.isDigit(s.charAt(i - 1))) {
                    int num = Integer.parseInt(temp);
                    if (isNegative) num *= -1;
                    stack.peek().add(new NestedInteger(num));
                }

                temp = "";
                isNegative = false;
                if (s.charAt(i) == ']' && stack.size() > 1) {
                    NestedInteger tempNestedInteger = stack.pop();
                    stack.peek().add(tempNestedInteger);
                }
            }
        }
        return stack.peek();
    }



    class NestedInteger {

        public  NestedInteger() {

        }

        public NestedInteger(int a) {
            //
        }

        public void add(NestedInteger nestedInteger) {
            //
        }
    }
}
