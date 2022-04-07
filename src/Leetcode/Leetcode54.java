package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode54 {


    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        int eleNum = matrix.length * matrix[0].length;
        List<Integer> res = new ArrayList<>();
        while (eleNum >= 1) {
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
                eleNum--;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
                eleNum--;
            }
            right--;

            for (int i = right; i >= left; i--) {
                res.add(matrix[bottom][i]);
                eleNum--;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                res.add(matrix[left][i]);
                eleNum--;
            }
            left++;

        }

        return res;
    }
}

