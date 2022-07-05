package Leetcode;

import utils.Node;

public class JZ2_029 {
    public Node insert(Node head, int insertVal) {
        Node insert = new Node(insertVal);

        if (head == null) {
            insert.next = insert;
            return insert;
        }

        if (head.next == null) {
            head.next = insert;
            insert.next = head;
            return head;
        }

        Node cur = head;
        Node next = head.next;


        while (next != head) {
            if (cur.val <= insertVal && insertVal <= next.val) {
                break;
            }
            if (cur.val > next.val) {
                if (insertVal >= cur.val || insertVal <= next.val) {
                    break;
                }
            }
            cur = cur.next;
            next = next.next;
        }

        cur.next = insert;
        insert.next = next;
        return head;
    }
}
