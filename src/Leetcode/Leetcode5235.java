package Leetcode;

import java.util.*;

public class Leetcode5235 {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < matches.length; i++) {
            map.put(matches[i][0], map.getOrDefault(matches[i][0], 0));
            map.put(matches[i][1], map.getOrDefault(matches[i][0], 0) - 1);
        }
        List<Integer> win = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 0) {
                win.add(entry.getKey());
            }
            if (entry.getValue() == -1) {
                one.add(entry.getKey());
            }
        }
        win.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1- o2;
            }
        });
        one.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1- o2;
            }
        });
        List<List<Integer>> res = new ArrayList<>();
        res.add(win);
        res.add(one);
        return res;
    }
}
