package 剑指offer;

public class JZ47 {
    public int maxValue(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0) grid[i][j] = grid[0][0];
                else if (i == 0) grid[i][j] = grid[i][j-1] + grid[i][j];
                else if (j == 0) grid[i][j] = grid[i - 1][j] + grid[i][j];
                else grid[i][j] = Math.max(grid[i - 1][j], grid[i][j-1]) + grid[i][j];
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];

    }
}
