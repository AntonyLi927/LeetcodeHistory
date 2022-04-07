package leetcode21;

import utils.ListNode;

public class Leetcode21 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null) return null;
        ListNode listNode = new ListNode();
        ListNode temp = listNode;
        while (true){
            if (l1==null&&l2==null) break;
            if (l1 == null) {
                temp.val = l2.val;
                if (l2.next!=null){
                    ListNode l = new ListNode();
                    temp.next = l;
                    temp = temp.next;
                    l2 = l2.next;
                    continue;
                }
                else {
                    break;
                }

            }
            if (l2 == null){
                temp.val = l1.val;
                if (l1.next!=null){
                    ListNode l = new ListNode();
                    temp.next = l;
                    temp = temp.next;
                    l1 = l1.next;
                    continue;
                }
                else {
                    break;
                }
            }
            if (l1.val<=l2.val){
                temp.val = l1.val;
                ListNode l = new ListNode();
                temp.next = l;
                temp = temp.next;
                l1 = l1.next;
                continue;
            }
            if (l1.val>l2.val){
                temp.val = l2.val;
                ListNode l = new ListNode();
                temp.next = l;
                temp = temp.next;
                l2 = l2.next;
                continue;
            }
        }
        return listNode;
    }

    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        ListNode temp = listNode;
        while (l1!=null&&l2!=null){
            if (l1.val<=l2.val){
                temp.next = l1;
                temp = temp.next;
                l1 = l1.next;
            }
            else {
                temp.next = l2;
                temp = temp.next;
                l2 = l2.next;
            }
        }
        if (l1 == null){
            temp.next = l2;
        }
        else {
            temp.next = l1;
        }
        return listNode.next;
    }

    public static void main(String[] args) {
        ListNode l12 = new ListNode(4);
        ListNode l11 = new ListNode(2,l12);
        ListNode l1 = new ListNode(1,l11);

        ListNode l22 = new ListNode(4);
        ListNode l21 = new ListNode(3,l22);
        ListNode l2 = new ListNode(1,l21);
        ListNode result = mergeTwoLists2(l1,l2);
        while (true){
            System.out.println(result.val);
            result = result.next;
        }

    }
}
