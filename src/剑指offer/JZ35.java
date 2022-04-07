package 剑指offer;

import utils.Node;

public class JZ35 {
    public Node copyRandomList(Node head) {
        if (head==null) return null;
        Node ini = head;

        while (head!=null){
            Node node = new Node(head.val);
            node.next = head.next;
            head.next = node;
            head = head.next.next;
        }

        head = ini;

        while (head!=null){
            if (head.random!=null){
                head.next.random = head.random.next;
            }

            head = head.next.next;
        }
        head = ini;

        Node res = head.next;
        Node temp = head.next;

        while (head!=null){
            head.next = head.next.next;
            head = head.next;

            if (head!=null){
                temp.next = temp.next.next;
                temp = temp.next;
            }

        }

        return res;

    }
}
