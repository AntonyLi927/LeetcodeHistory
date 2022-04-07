package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC56 {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> temp = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            List<Integer> intTemp = new ArrayList<>();
            for (int j = 0; j < intervals[0].length; j++) {
                intTemp.add(intervals[i][j]);
            }
            temp.add(intTemp);
        }

        for (int i = 0; i < temp.size() - 1; i++) {
            if (temp.get(i).get(1) >= temp.get(i + 1).get(0)){
                temp.get(i).set(1,temp.get(i + 1).get(1));
                temp.remove(i + 1);
                i--;
            }
        }
        int[][] res = new int[temp.size()][2];
        for (int i = 0; i < temp.size(); i++) {
            for (int j = 0; j < 2; j++) {
                res[i][j] = temp.get(i).get(j);
            }
        }
        return res;
    }
}
