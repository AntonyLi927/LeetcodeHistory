package Leetcode;

import utils.TreeNode;

public class Leetcode337 {
    public int rob(TreeNode root) {
        dfs(root);
        return root.val;
    }

    public void dfs(TreeNode root){
        if (root.left != null) rob(root.left);
        if (root.right != null) rob(root.right);
        int childrenSum = 0;
        int grandchildrenSum = 0;
        if (root.left != null){
            childrenSum = childrenSum + root.left.val;
            grandchildrenSum = grandchildrenSum + (root.left.left == null ? 0 : root.left.left.val) + (root.left.right == null ? 0 : root.left.right.val);
        }
        if (root.right != null){
            childrenSum = childrenSum + root.right.val;
            grandchildrenSum = grandchildrenSum + (root.right.left == null ? 0 : root.right.left.val) + (root.right.right == null ? 0 : root.right.right.val);
        }
        root.val = Math.max(childrenSum, grandchildrenSum + root.val);
        return;
    }
}
