package 剑指offer;

import utils.TreeNode;

public class JZ54 {

    int k;
    int res;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }

    public void dfs(TreeNode root){
        if (root==null) return;

        dfs(root.right);
        if (k == 0) return;
        k = k-1;
        if (k == 0) res = root.val;
        dfs(root.left);

    }


}
