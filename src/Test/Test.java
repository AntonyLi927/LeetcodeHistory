package Test;

import utils.ListNode;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {
    public String a = "1";

    public int find(int[] arr, int target){

        int left = 0;
        int right = arr.length - 1;
        int middle = 0;

        while (left <= right){
            middle = left + (right - left) / 2;

            if (arr[middle] == target) return arr[middle];
            else if (target < arr[middle]){
                right = middle - 1;
                continue;
            }
            else {
                left = middle + 1;
                continue;
            }
        }

        return -1;
    }

    public ListNode findNode(ListNode head){
        if (head == null || head.next == null){
            return null;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }


    public Map<String, List<ListNode>> match(List<ListNode> lists){
        Map<String, List<ListNode>> stringListMap = new HashMap<>();
        for (ListNode listNode : lists){
            List<ListNode> temp = stringListMap.getOrDefault(listNode.val, new ArrayList<>());
            temp.add(listNode);
            stringListMap.put(""+listNode.val, temp);
        }
        return stringListMap;
    }


    public static int[] bubbleSort(int[] arr){
        if (arr == null || arr.length == 0) return null;
        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] >= arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

//        Date date = new Date(1642125538226L);
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        String res = simpleDateFormat.format(date);
//        System.out.println(res);
//
//        Date date1 = new Date(System.currentTimeMillis() + 1000 * 60);
//        System.out.println(date1.getTime());
//        int re = (int) (Math.random() * (1000000 - 100000 + 1));
//        System.out.println(re);
        char a = '9';
        char b = '3';
        System.out.println(b < a);
    }
}
