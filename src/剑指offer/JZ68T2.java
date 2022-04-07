package 剑指offer;

import utils.TreeNode;

public class JZ68T2 {

    TreeNode res = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       dfs(root, p ,q);
       return res;
    }

    public boolean dfs(TreeNode root, TreeNode p, TreeNode q){
        if (root == null) return false;

        boolean left = dfs(root.left, p, q);
        boolean right = dfs(root.right, p, q);

        if ((left && right) || ((p.val == root.val || q.val == root.val)&&(left || right))){
            res = root;
        }

        if (root.val == p.val || root.val == q.val || right || left) return true;

        return false;
    }

}
