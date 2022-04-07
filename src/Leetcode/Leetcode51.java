package Leetcode;

import java.util.*;

public class Leetcode51 {

    int n;
    Set<Integer> columns = new HashSet<>();
    Set<Integer> diagonals1 = new HashSet<>();
    Set<Integer> diagonals2 = new HashSet<>();

    public List<List<String>> solveNQueens(int n) {
        int[] queens = new int[n];
        Arrays.fill(queens, -1);
        this.n = n;
        List<List<String>> res = new ArrayList<>();
        backtrack(res, queens, 0);
        return res;
    }


    public void backtrack(List<List<String>> res, int[] queens, int row) {
        if (row == n) {
            res.add(generateBoard(queens));
        }

        for (int i = 0; i < n; i++) {
            if (columns.contains(i)) {
                continue;
            }
            int diagonal1 = row - i;
            if (diagonals1.contains(diagonal1)) {
                continue;
            }
            int diagonal2 = row + i;
            if (diagonals2.contains(diagonal2)) {
                continue;
            }
            columns.add(i);
            diagonals1.add(diagonal1);
            diagonals2.add(diagonal2);
            queens[row] = i;
            backtrack(res, queens, row + 1);
            columns.remove(i);
            diagonals1.remove(diagonal1);
            diagonals2.remove(diagonal2);
            queens[row] = -1;
        }
    }

    public List<String> generateBoard(int[] queens) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int temp = queens[i];
            String s = "";
            for (int j = 0; j < n; j++) {
                if (j == temp) s += "Q";
                else s += ".";
            }
            res.add(s);
        }
        return res;
    }

}
