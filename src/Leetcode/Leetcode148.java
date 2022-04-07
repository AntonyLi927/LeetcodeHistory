package Leetcode;

import utils.ListNode;

public class Leetcode148 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode low = head;
        ListNode high = head.next;

        while (high != null && high.next != null) {
            low = low.next;
            high = high.next.next;
        }
        ListNode temp = low.next;
        low.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(temp);

        return merge(left, right);
    }


    public ListNode merge(ListNode left, ListNode right) {
        ListNode res = new ListNode();
        ListNode fr = res;
        while (left != null && right != null) {
            if (left.val <= right.val) {
                res.next = left;
                res = res.next;
                left = left.next;
            } else {
                res.next = right;
                res = res.next;
                right = right.next;
            }
        }

        res.next = left != null ? left : right;
        return fr.next;
    }
}
