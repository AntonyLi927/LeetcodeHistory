package Leetcode2;

import utils.ListNode;
/**
 * Leetcode 2
 *
 * 2021/2/26
*/
public class Leetcode2 {
    public static ListNode solution(ListNode l1, ListNode l2){
        ListNode result = new ListNode();
        ListNode temp = new ListNode();
        result.next = temp;
        int carry = 0;
        while(true){
            if(l1!=null&&l2!=null){
                if(l1.val+l2.val+carry>=10){
                    temp.val = l1.val+l2.val+carry-10;
                    carry = 1;
                }
                else{
                    temp.val = l1.val+l2.val+carry;
                    carry = 0;
                }
                if(l1.next!=null||l2.next!=null){
                    temp.next = new ListNode();
                    temp = temp.next;
                    l1 = l1.next;
                    l2 = l2.next;
                }
                else{
                    if(carry>0){
                        temp.next = new ListNode();
                        temp = temp.next;
                        temp.val = carry;
                        return result.next;
                    }
                    else{
                        return result.next;
                    }
                }
            }
            else if(l1==null){
                if(l2.val+carry>=10){
                    temp.val = l2.val+carry-10;
                    carry = 1;
                }
                else{
                    temp.val = l2.val+carry;
                    carry = 0;
                }
                if(l2.next!=null){
                    temp.next = new ListNode();
                    temp = temp.next;
                    l1 = null;
                    l2 = l2.next;
                }
                else{
                    if(carry>0){
                        temp.next = new ListNode();
                        temp = temp.next;
                        temp.val = carry;
                        return result.next;
                    }
                    else{
                        return result.next;
                    }
                }
            }
            else if(l2 == null){
                if(l1.val+carry>=10){
                    temp.val = l1.val+carry-10;
                    carry = 1;
                }
                else{
                    temp.val = l1.val+carry;
                    carry = 0;
                }

                if(l1.next!=null){
                    temp.next = new ListNode();
                    temp = temp.next;
                    l1 = l1.next;
                    l2 = null;
                }
                else{
                    if(carry>0){
                        temp.next = new ListNode();
                        temp = temp.next;
                        temp.val = carry;
                        return result.next;
                    }
                    else{
                        return result.next;
                    }
                }
            }
            else{
                return result.next;
            }
        }
    }
}

