package Leetcode;

import utils.ListNode;

public class Leetcode82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode res = new ListNode();
        res.next = head;
        ListNode prev = head;
        ListNode prevPrev = res;
        head = head.next;
        while (head != null) {
            if (head.val == prev.val) {
                while (head != null && prev.val == head.val) {
                    prev.next = head.next;
                    head = head.next;
                }
                prevPrev.next = head;
                prev = head;
                if (head != null) head = head.next;
                else head = null;
            } else {
                prevPrev = prev;
                prev = head;
                head = head.next;
            }

        }
        return res.next;
    }
}
