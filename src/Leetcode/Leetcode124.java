package Leetcode;

import utils.TreeNode;

public class Leetcode124 {

    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return max;
    }

    public int dfs(TreeNode root){
        if (root == null) return 0;

        int leftGain = Math.max(dfs(root.left), 0);
        int rightGain = Math.max(dfs(root.right), 0);

        int routeLength = root.val + leftGain + rightGain;
        if (routeLength > max) max = routeLength;

        return root.val + Math.max(leftGain, rightGain);
    }
}
