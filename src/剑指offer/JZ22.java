package 剑指offer;

import utils.ListNode;

public class JZ22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head;
        for (int i=1;i<=k;i++){
            fast = fast.next;
        }
        while (fast!=null){
            head = head.next;
            fast = fast.next;
        }
        return head;
    }
}
