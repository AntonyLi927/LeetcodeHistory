package Leetcode;

import utils.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leetcode234 {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        int length = 0;
        Stack<Integer> a = new Stack<>();

        while (head != null) {
            length++;
            head = head.next;
        }

        head =  temp;
        for (int i = 1; i <= length / 2; i++) {
            a.push(head.val);
            head = head.next;
        }

        if (length % 2 != 0) head = head.next;
        while (head != null) {
            if (head.val == a.pop()) {
                head = head.next;
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
