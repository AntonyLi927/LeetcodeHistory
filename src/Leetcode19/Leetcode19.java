package Leetcode19;

import utils.ListNode;

public class Leetcode19 {
    public static ListNode solution(ListNode head, int n){
        ListNode fastNode = head;
        ListNode lowNode = head;
        for (int i=0;i<n;i++){
            fastNode = fastNode.next;
        }
        if (fastNode == null) return head.next;
        while (fastNode.next!=null){
            fastNode = fastNode.next;
            lowNode = lowNode.next;
        }
        lowNode.next = lowNode.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2,node3);
        ListNode node1 = new ListNode(1,node2);
        Leetcode19.solution(node1,2);

    }
}
