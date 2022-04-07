package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    public static class Node {
        Node pre;
        Node next;
        Integer val;
        Integer key;
    }

    private Node head;
    private Node tail;

    private Map<Integer, Node> map = new HashMap<>();

    private Integer size;
    private Integer capacity;

    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.head = new Node();
        this.tail = new Node();
        head.next = tail;
        tail.pre = head;
    }

    int get(int key) {
        Node temp = map.get(key);
        if (temp == null) return -1;
        else {
            int res = temp.val;
            temp.pre.next = temp.next;
            temp.next.pre = temp.pre;
            temp.pre = head;
            temp.next = head.next;
            head.next.pre = temp;
            head.next = temp;
            return res;
        }
    }

    void put(int key, int value) {
        Node temp = map.get(key);
        if (temp == null) {
            Node newNode = new Node();
            newNode.val = value;
            newNode.key = key;
            newNode.pre = head;
            newNode.next = head.next;
            head.next.pre = newNode;
            head.next = newNode;
            map.put(key, newNode);
            size++;
        } else {
            temp.val = value;
            temp.pre.next = temp.next;
            temp.next.pre = temp.pre;
            temp.pre = head;
            temp.next = head.next;
            head.next.pre = temp;
            head.next = temp;

            return;
        }

        if (size > capacity) {
            Node del = tail.pre;
            del.pre.next = del.next;
            del.next.pre = del.pre;
            map.remove(del.key);
            size--;
        }

    }




}
