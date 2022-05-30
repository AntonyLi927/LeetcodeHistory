package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode40 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates, target, new ArrayList<>(), 0, 0);
        return res;
    }

    public void dfs(int[] candidates, int target, List<Integer> temp, int start, int sum) {
        if (sum > target) return;
        if (sum == target) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            temp.add(candidates[i]);
            dfs(candidates, target, temp, i + 1, sum + candidates[i]);
            temp.remove(temp.size() - 1);
        }
    }
}
