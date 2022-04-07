package Leetcode;

import utils.TreeNode;

public class Leetcode543 {

    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return max;
    }

    public void dfs(TreeNode root){
        if (root == null) return;
        dfs(root.left);
        dfs(root.right);
        int leftLength = root.left == null ? 0 : root.left.val;
        int rightLength = root.right == null ? 0 : root.right.val;
        root.val = Math.max(leftLength, rightLength) + 1;
        if (leftLength + rightLength >= max) max = leftLength + rightLength;
        return;
    }
}
