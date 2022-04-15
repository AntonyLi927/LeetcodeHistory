package Leetcode;

import utils.ListNode;

import java.util.List;

public class Leetcode61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        ListNode temp = head;
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        head = temp;

        for (int i = 1; i <= k % len; i++) {
            ListNode prev = head;
            while (prev.next.next != null) {
                prev = prev.next;
            }
            prev.next.next = head;
            head = prev.next;
            prev.next = null;
        }
        return head;
    }
}
