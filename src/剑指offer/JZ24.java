package 剑指offer;

import utils.ListNode;

public class JZ24 {
    public static ListNode reverseList(ListNode head) {
        ListNode reverse = new ListNode();
        while (head!=null){
            ListNode temp = reverse.next;
            reverse.next = new ListNode(head.val);
            reverse.next.next = temp;
            head = head.next;
        }
        return reverse.next;
    }

}
