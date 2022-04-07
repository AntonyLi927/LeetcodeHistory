package Leetcode;

import utils.ListNode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode142 {
    public ListNode detectCycle(ListNode head) {
        Map<ListNode, Integer> map = new HashMap<>();
        while (head != null){
            if (map.get(head) == null) {
                map.put(head, 1);
            } else {
                return head;
            }
            head = head.next;
        }

        return null;
    }
}
