package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode417 {


    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights[0].length; j++) {
                if (pacificRecursion(heights, i, j) && atlanticRecursion(heights, i, j)) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    res.add(temp);
                }
            }
        }
        return res;
    }

    public boolean pacificRecursion(int[][] heights, int row, int col) {
        if (row < 1 || col < 1) {
            return true;
        }
        boolean pacific = false;
        if (heights[row - 1][col] <= heights[row][col] || heights[row][col - 1] <= heights[row][col]) {
            pacific = pacificRecursion(heights, row - 1, col) || pacificRecursion(heights, row, col - 1);
        }
        return pacific;
    }

    public boolean atlanticRecursion(int[][] heights, int row, int col) {
        if (row >= heights.length - 1 || col >= heights[0].length - 1) {
            return true;
        }
        boolean atlantic = false;
        if (heights[row + 1][col] <= heights[row][col] || heights[row][col + 1] <= heights[row][col]) {
            atlantic = atlanticRecursion(heights, row + 1, col) || atlanticRecursion(heights, row, col + 1);
        }
        return atlantic;
    }

    public static void main(String[] args) {
        int[][] a = new int[3][];
        a[0] = new int[]{1,2,2,3,5};
        a[1] = new int[]{3,2,3,4,4};
        a[2] = new int[]{2,4,5,3,1};
        new Leetcode417().pacificAtlantic(a);
    }

}
