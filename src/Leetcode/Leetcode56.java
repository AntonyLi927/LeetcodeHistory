package Leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class Leetcode56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] interval1, int[] interval2) {
                return interval1[0] - interval2[0];
            }
        });

        int length = intervals.length;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= intervals[i - 1][1] && intervals[i][1] >= intervals[i - 1][1]) {
                int tempMin = Math.min(intervals[i][0], intervals[i - 1][0]);
                int tempMax = Math.max(intervals[i][1], intervals[i - 1][1]);
                intervals[i][0] = tempMin;
                intervals[i][1] = tempMax;
                intervals[i - 1][0] = -1;
                intervals[i - 1][1] = -1;
                length--;
            }
        }
        int[][] res = new int[length][2];
        int index = 0;
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] != -1) {
                res[index][0] = intervals[i][0];
                res[index][1] = intervals[i][1];
                index++;
            }
        }
        return res;
    }
}
