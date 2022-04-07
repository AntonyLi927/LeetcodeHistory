package 剑指offer;

import utils.ListNode;

import java.util.HashSet;
import java.util.Set;

public class JZ52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> listNodeSet = new HashSet<>();
        while (headA != null){
            listNodeSet.add(headA);
            headA = headA.next;
        }

        while (headB != null){
            if (listNodeSet.contains(headB)) return headB;
            headB = headB.next;
        }

        return null;
    }
}
