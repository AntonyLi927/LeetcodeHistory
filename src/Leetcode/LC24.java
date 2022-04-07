package Leetcode;

import utils.ListNode;

import java.util.List;

public class LC24 {
    public ListNode swapPairs(ListNode head) {

        ListNode res= head;
        ListNode prev = null;

        while (head != null && head.next != null){
            if (prev != null){
                ListNode next = head.next.next;
                prev.next = head.next;
                head.next = next;
                prev.next.next = head;
                prev = prev.next.next;
                head = head.next;
            }
            else {
                ListNode next = head.next.next;
                head.next.next = head;
                res = head.next;
                head.next = next;
                prev = head;
                head = head.next;
            }
        }

        return res;
    }
}
