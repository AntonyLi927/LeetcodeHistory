package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int left = newInterval[0];
        int right = newInterval[1];
        boolean placed = false;
        List<int[]> temp = new ArrayList<>();
        for (int[] interval : intervals) {
            if (interval[0] > right) {
                if (!placed) {
                    temp.add(new int[]{left, right});
                    placed = true;
                }
                temp.add(interval);
            } else if (interval[1] < left) {
                temp.add(interval);
            } else {
                left = Math.min(left, interval[0]);
                right = Math.max(right, interval[1]);
            }
        }

        if (!placed) {
            temp.add(new int[]{left, right});
        }

        int[][] res = new int[temp.size()][2];

        for (int i = 0; i < temp.size(); i++) {
            res[i] = temp.get(i);
        }
        return res;
    }
}
