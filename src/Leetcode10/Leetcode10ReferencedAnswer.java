package Leetcode10;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Leetcode10ReferencedAnswer {
    public boolean isValid(String s) {
        boolean result = false;
        if (s.length()%2!=0) return false;
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        Deque<Character> stack = new LinkedList<>();
        for (int i=0;i<s.length();i++){
            if (map.containsKey(s.charAt(i))){
                stack.push(s.charAt(i));
                continue;
            }
            else {
                if (!stack.isEmpty()){
                    if (map.get(stack.peek())==s.charAt(i)){
                        stack.pop();
                        result = true;
                    }
                    else {
                        result = false;
                        return result; // {[}]
                    }
                }
                else result = false;
            }
        }
        if (!stack.isEmpty()) result = false;// [[[]
        return result;
    }

    public static void main(String[] args) {

    }
}
