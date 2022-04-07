package 剑指offer;

import utils.ListNode;

public class JZ18 {
    public static ListNode deleteNode(ListNode head, int val) {
        ListNode temp = head;
        if (head.val == val) return head.next;
        while (temp.next!=null){
            if (temp.next.val == val){
                temp.next = temp.next.next;
                return head;
            }
            else {
                temp = temp.next;
            }
        }
        return head;
    }
}
