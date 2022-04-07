package Leetcode;

import utils.TreeNode;

public class Leetcode538 {
    int max = 0;
    public TreeNode convertBST(TreeNode root) {
        if(root == null) return null;
        if (root.right != null) convertBST(root.right);
        root.val += max;
        max = root.val;
        if (root.left != null) convertBST(root.left);
        return root;
    }
}
