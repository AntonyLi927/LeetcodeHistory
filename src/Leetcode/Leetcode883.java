package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode883 {
    public int projectionArea(int[][] grid) {
        int res = 0;

        List<Integer> row = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            int max = 0;
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] >= max) max = grid[i][j];
                if (grid[i][j] != 0) res++;
            }
            row.add(max);
        }

        List<Integer> col = new ArrayList<>();
        for (int i = 0; i < grid[0].length; i++) {
            int max = 0;
            for (int j = 0; j < grid.length; j++) {
                if (grid[j][i] >= max) max = grid[j][i];

            }
            col.add(max);
        }
        for (Integer i : row) {
            res += i;
        }
        for (Integer i : col) {
            res += i;
        }

        return res;
    }
}
