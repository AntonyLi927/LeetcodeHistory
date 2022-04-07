package Leetcode;

import utils.TreeNode;

public class Leetcode236 {

    TreeNode res = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return res;
    }

    public boolean dfs(TreeNode root, TreeNode p, TreeNode q){
        boolean leftRes = false;
        boolean rightRes = false;
        if (root.left != null) leftRes = dfs(root.left, p, q);
        if (root.right != null) rightRes = dfs(root.right, p, q);
        if ((root.val == p.val) || (root.val == q.val)) return true;

        if ((leftRes == true && rightRes == true) || ((root.val == p.val || root.val == q.val) && (leftRes || rightRes))){
            res = root;
            return true;
        }

        if (leftRes == true || rightRes == true) return true;
        else return false;
    }


}
