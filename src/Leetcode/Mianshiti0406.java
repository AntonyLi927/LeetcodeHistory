package Leetcode;

import utils.TreeNode;

public class Mianshiti0406 {

    TreeNode res;
    boolean isFind = false;
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        mid(root, p);
        return res;
    }

    public void mid(TreeNode root, TreeNode p) {

        if (root == null) {
            return;
        }
        mid(root.left, p);
        if (res != null) return;
        if (root.val == p.val) {
            isFind = true;
        } else if (isFind) {
            res = root;
            return;
        }
        mid(root.right, p);
    }
}
