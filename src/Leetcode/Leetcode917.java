package Leetcode;

import utils.ListNode;

import java.util.*;

public class Leetcode917 {
    public String reverseOnlyLetters(String s) {
        String res = "";
        List<Integer> nums = new ArrayList<>();
        Queue<Character> signStack = new LinkedList<>();
        Stack<Character> wordStack = new Stack<>();
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if ((temp >= 'a' && temp <= 'z') || (temp >= 'A' && temp <= 'Z')) {
                num++;
                wordStack.push(temp);
            } else {
                nums.add(num);
                num = 0;
                signStack.add(temp);
            }
        }
        nums.add(new Integer(num));
        for (int i = 0; i <nums.size(); i++) {
            int wordNum = nums.get(i);
            for (int j = 0; j < wordNum; j++) {
                res += wordStack.pop();
            }
            res += signStack.isEmpty() ? "" : signStack.poll();

        }
        return res;
    }
}
