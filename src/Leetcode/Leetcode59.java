package Leetcode;

public class Leetcode59 {
    public static int[][] generateMatrix(int n) {
        int left = 0;
        int top = 0;
        int right = n - 1;
        int bottom = n - 1;
        int eleNum = n * n;
        int[][] res = new int[n][n];
        int num = 1;
        while (eleNum >= 1) {
            for (int i = left; i <= right; i++) {
                res[top][i] = num;
                num++;
                eleNum--;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                res[i][right] = num;
                num++;
                eleNum--;
            }
            right--;

            for (int i = right; i >= left; i--) {
                res[bottom][i] = num;
                num++;
                eleNum--;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                res[i][left] = num;
                num++;
                eleNum--;
            }
            left++;

        }
        return res;
    }

    public static void main(String[] args) {
        generateMatrix(3);
    }
}
