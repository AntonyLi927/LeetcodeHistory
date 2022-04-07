package Leetcode;

import utils.ListNode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode, Integer> map = new HashMap<>();
        while (headA != null){
            map.put(headA, 1);
            headA = headA.next;
        }

        while (headB != null){
            if (map.get(headB) != null){
                return headB;
            } else {
                headB = headB.next;
                continue;
            }
        }

        return null;
    }
}
