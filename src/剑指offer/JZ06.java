package 剑指offer;

import utils.ListNode;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

public class JZ06 {
    public static int[] reversePrint(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head!=null){
            list.add(head.val);
            head = head.next;
        }
        int index = list.size()-1;
        int[] result = new int[list.size()];
        for (Integer i:list){
            result[index] = i;
            index--;
        }
        return result;
    }
    public static int[] reversePrint1(ListNode head) {
        ListNode listNode = head;
        int count = 0;
        while (head!=null){
            count++;
            head = head.next;
        }
        int[] result = new int[count];
        count--;
        while (listNode!=null){
            result[count] = listNode.val;
            listNode = listNode.next;
            count--;
        }
        return result;
    }
}
