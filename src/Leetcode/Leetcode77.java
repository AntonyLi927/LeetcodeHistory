package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode77 {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        dfs(1, n, k, new ArrayList<>());
        return res;
    }

    public void dfs(int start, int n, int k, List<Integer> temp) {
        if (temp.size() == k) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i <= n; i++) {
            temp.add(i);
            dfs(i + 1, n, k, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
