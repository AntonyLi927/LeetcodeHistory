package Leetcode;

public class Leetcode498 {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m * n];
        int index = 0;
        for (int i = 0; i < m + n - 1; i++) {
            if (i % 2 != 0) {
                int x = i < n ? 0 : i - n + 1;
                int y = i < n ? i : n - 1;
                while (y >= 0 && x < m) {
                    res[index] = mat[x][y];
                    index++;
                    y--;
                    x++;
                }
            } else {
                int x = i < m ? i : m - 1;
                int y = i < m ? 0 : i - m + 1;
                while (x >= 0 && y < n) {
                    res[index] = mat[x][y];
                    index++;
                    x--;
                    y++;
                }
            }
        }
        return res;


    }
}
