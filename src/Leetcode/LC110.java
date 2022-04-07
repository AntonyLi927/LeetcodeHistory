package Leetcode;

import utils.TreeNode;

public class LC110 {

    public boolean isBalanced(TreeNode root) {
        return recur(root) >= 0;
    }

    public int recur(TreeNode root){
        if (root == null) return 0;

        int left = recur(root.left);
        int right = recur(root.right);

        if (left == -1 || right == -1 || Math.abs(left - right) > 1){
            return -1;
        }
        else {
            return Math.max(left, right) + 1;
        }
    }


}
