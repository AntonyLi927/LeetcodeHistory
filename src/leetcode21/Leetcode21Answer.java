package leetcode21;

import utils.ListNode;

public class Leetcode21Answer {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }


    public static void main(String[] args) {
        ListNode l12 = new ListNode(4);
        ListNode l11 = new ListNode(2,l12);
        ListNode l1 = new ListNode(1,l11);

        ListNode l22 = new ListNode(4);
        ListNode l21 = new ListNode(3,l22);
        ListNode l2 = new ListNode(1,l21);
        ListNode result = mergeTwoLists(l1,l2);
        while (true){
            System.out.println(result.val);
            result = result.next;
        }

    }
}
