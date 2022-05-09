package Leetcode;

import java.util.*;

public class Leetcode6041 {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                map.put(nums[i][j], map.getOrDefault(nums[i][j], 0) + 1);
            }
        }

        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == nums.length) {
                res.add(entry.getKey());
            }
        }
        res.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        return res;
    }
}
