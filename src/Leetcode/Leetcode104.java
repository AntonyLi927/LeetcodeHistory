package Leetcode;

import utils.TreeNode;

public class Leetcode104 {

    int max = 0;

    public int maxDepth(TreeNode root) {
        dfs(root, 0);
        return max;
    }

    public void dfs(TreeNode root, int depth) {
        if (root == null) {
            max = Math.max(max, depth);
            return;
        }

        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }
}
