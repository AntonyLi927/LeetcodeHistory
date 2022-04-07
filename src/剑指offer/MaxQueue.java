package 剑指offer;

import java.util.Deque;
import java.util.LinkedList;

class MaxQueue {

    Deque<Integer> list1;
    Deque<Integer> list2;

    public MaxQueue() {
        list1 = new LinkedList<>();
        list2 = new LinkedList<>();
    }

    public int max_value() {
        if (list2.isEmpty()) return -1;
        else return list2.getFirst();
    }

    public void push_back(int value) {

        while (!list2.isEmpty() && list2.getLast() < value){

            list2.removeLast();

        }
        list2.addLast(value);
        list1.addLast(value);

    }

    public int pop_front() {
        if (list1.isEmpty()) return -1;
        else{
            if (list1.getFirst() == list2.getFirst()) list2.removeFirst();
            int res = list1.getFirst();
            list1.removeFirst();
            return res;
        }
    }
}