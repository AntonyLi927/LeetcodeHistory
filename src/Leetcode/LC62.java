package Leetcode;

public class LC62 {
    /**
     * 又超时了
     */
//    int res = 0;
//
//    public int uniquePaths(int m, int n) {
//        dfs(1, 1, m, n);
//        return res;
//    }
//
//    public void dfs(int row, int col, int m, int n){
//        if (row == m && col == n){
//            res++;
//            return;
//        }
//        if (row > m || col > n){
//            return;
//        }
//        dfs(row + 1, col, m, n);
//        dfs(row, col + 1, m, n);
//    }
    /**
     * 用动态规划啊
     *
     */
    public int uniquePaths(int m, int n) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < n; i++) matrix[0][i] = 1;
        for (int i = 0; i < m; i++) matrix[i][0] = 1;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
            }
        }
        return matrix[m - 1][n - 1];
    }
}
