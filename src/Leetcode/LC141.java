package Leetcode;

import utils.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LC141 {

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        Set<ListNode> set = new HashSet<>();
        while (head != null){
            boolean temp = set.add(head);
            if (temp) head = head.next;
            else return true;
        }
        return false;
    }

    /**
     *  作者：LeetCode-Solution
     *  链接：https://leetcode-cn.com/problems/linked-list-cycle/solution/huan-xing-lian-biao-by-leetcode-solution/
     *  来源：力扣（LeetCode）
     *  著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param head
     * @return
     */
    public boolean hasCycle1(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }


}
