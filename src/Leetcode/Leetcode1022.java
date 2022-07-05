package Leetcode;

import utils.TreeNode;

public class Leetcode1022 {


    int ans = 0;

    public int sumRootToLeaf(TreeNode root) {
        dfs(root, 0);
        return ans;
    }
    void dfs(TreeNode root, int cur) {
        int ncur = (cur << 1) + root.val;
        if (root.left != null) dfs(root.left, ncur);
        if (root.right != null) dfs(root.right, ncur);
        if (root.left == null && root.right == null) ans += ncur;
    }


    public static void main(String[] args) {
    }
}
