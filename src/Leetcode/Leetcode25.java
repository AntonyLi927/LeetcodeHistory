package Leetcode;

import utils.ListNode;

public class Leetcode25 {
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode prevTail  = new ListNode();
        ListNode res = prevTail;
        while (head != null) {
            ListNode tempHead = head;
            for (int i = 1; i <= k; ++i) {
                if (head == null) {
                    prevTail.next = tempHead;
                    return res.next;
                }
                head = head.next;
            }
            head = tempHead;
            int i = 2;
            ListNode prev = head;
            ListNode tempTail = head;
            head = head.next;
            tempTail.next = null;
            while (i <= k && head != null) {
                ListNode next = head.next;
                head.next = prev;

                prev = head;
                head = next;
                i++;
            }
            prevTail.next = prev;
            prevTail = tempTail;

        }
        return res.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(1);
        node5.next = node4;
        node4.next = node3;
        node3.next = node2;
        node2.next = node1;
        reverseKGroup(node5, 3);

    }
}
