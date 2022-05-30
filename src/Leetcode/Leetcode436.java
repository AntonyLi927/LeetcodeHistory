package Leetcode;

import java.util.Arrays;

public class Leetcode436 {
    public int[] findRightInterval(int[][] intervals) {
        int[][] temp = new int[intervals.length][2];
        for (int i = 0; i < intervals.length; i++) {
            temp[i][0] = intervals[i][0];
            temp[i][1] = i;
        }

        Arrays.sort(temp, (o1, o2) -> o1[0] - o2[0]);

        int[] ans = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            int left = 0;
            int right = temp.length - 1;
            int end = intervals[i][1];
            int target = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (end <= temp[mid][0]) {
                    right = mid - 1;
                    target = temp[mid][1];
                } else {
                    left = mid + 1;
                }
            }

            ans[i] = target;
        }

        return ans;
    }
}
