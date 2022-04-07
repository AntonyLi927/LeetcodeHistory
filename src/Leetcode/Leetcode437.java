package Leetcode;

import utils.TreeNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode437 {
    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> prefix = new HashMap<>();
        prefix.put(0L, 1);
        return dfs(root, prefix, 0, targetSum);
    }

    public int dfs(TreeNode root, Map<Long, Integer> prefix, long curr, long targetSum){
        if (root == null) return 0;

        curr += root.val;
        int res = 0;

        if (curr == targetSum) res++;
        res = prefix.getOrDefault(curr - targetSum, 0);
        prefix.put(curr, prefix.getOrDefault(curr, 0) + 1);
        res += dfs(root.left, prefix, curr, targetSum);
        res += dfs(root.right, prefix, curr, targetSum);
        prefix.put(curr, prefix.get(curr) - 1);
        return res;
    }
}
