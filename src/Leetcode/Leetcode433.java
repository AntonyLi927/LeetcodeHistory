package Leetcode;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class Leetcode433 {
    public int minMutation(String start, String end, String[] bank) {
        char[] keys = new char[]{'A', 'C', 'G', 'T'};
        Set<String> valid = new HashSet<>();
        for (int i = 0; i < bank.length; i++) {
            valid.add(bank[i]);
        }
        Set<String> visited = new HashSet<>();
        if (start.equals(end)) {
            return 0;
        }
        if (!valid.contains(end)) {
            return -1;
        }
        Queue<String> queue = new ArrayDeque<>();
        queue.add(start);
        visited.add(start);
        int res = 1;
        while (queue.size() > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String temp = queue.poll();
                for (int j = 0; j < 8; j++) {
                    for (int k = 0; k < 4; k++) {
                        if (temp.charAt(j) != keys[k]) {
                            StringBuffer stringBuffer = new StringBuffer(temp);
                            stringBuffer.setCharAt(j, keys[k]);
                            if (valid.contains(stringBuffer.toString()) && !visited.contains(stringBuffer.toString())) {
                                if (stringBuffer.toString().equals(end)) {
                                    return res;
                                }
                                visited.add(stringBuffer.toString());
                                queue.add(stringBuffer.toString());
                            }
                        }
                    }
                }
            }
            res++;
        }
        return -1;

    }
}
