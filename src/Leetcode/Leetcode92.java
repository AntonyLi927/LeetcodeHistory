package Leetcode;

import utils.ListNode;

public class Leetcode92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode res = head;
        ListNode subHead = null;
        ListNode subHeadPrev = null;
        ListNode prev = null;
        int count = 1;
        while (head != null) {
            if (count == left - 1) {
                subHeadPrev = head;
            }
            if (count == left) {
                subHead = head;
            }
            if (left <= count && count <= right) {
                ListNode curNode = head;
                ListNode next = head.next;
                if (subHeadPrev != null && count == right) subHeadPrev.next = head;
                head.next = prev;
                prev = head;
                head = next;
                if (count == right) {
                    subHead.next = next;
                    if (subHeadPrev == null) return curNode;
                    else return res;
                }
                count++;
            } else {
                head = head.next;
                count++;
            }

        }
        return res;
    }
}
