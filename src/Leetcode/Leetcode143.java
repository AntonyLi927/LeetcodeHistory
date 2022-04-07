package Leetcode;

import utils.ListNode;

import java.util.List;

public class Leetcode143 {

    int length = 0;
    ListNode mid;

    public void reorderList(ListNode head) {

        ListNode temp = head;
        while (head != null) {
            length++;
            head = head.next;
        }
        head = temp;

        mid = head;
        for (int i = 1; i <= (length + 1) / 2; i++) {
            mid = mid.next;
        }
        recursion(head, 1);

    }

    public void recursion(ListNode node, int num) {
        if (length / 2 > num) {
            recursion(node.next, num + 1);
        }
        if (mid == null) return;
        if (length % 2 == 0 && length / 2 == num) node.next = null;
        if (length % 2 != 0 && length / 2 == num) node.next.next = null;
        ListNode tempNext = node.next;
        ListNode midNext = mid.next;
        node.next = mid;
        mid.next = tempNext;
        mid = midNext;
    }


}
