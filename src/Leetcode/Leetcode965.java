package Leetcode;

import utils.TreeNode;

public class Leetcode965 {


    int num;
    public boolean isUnivalTree(TreeNode root) {
        this.num = root.val;
        return dfs(root);
    }

    public boolean dfs(TreeNode root) {
        if (root.val != num) {
            return false;
        }
        boolean right = true;
        boolean left = true;
        if (root.left != null) right = dfs(root.left);
        if (root.right != null) left = dfs(root.right);
        return right && left;
    }
}
