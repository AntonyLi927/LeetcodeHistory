package 剑指offer;

import utils.TreeNode;

public class JZ55_2 {

    boolean res = true;
    public boolean isBalanced(TreeNode root) {
        dfs(root);
        return res;
    }

    public int dfs(TreeNode root){
        if(root!=null){
            int left = dfs(root.left);
            int right = dfs(root.right);
            if (Math.abs(left-right)>1) res  = false;
            return Math.max(left,right)+1;
        }
        else return 0;
    }
}
