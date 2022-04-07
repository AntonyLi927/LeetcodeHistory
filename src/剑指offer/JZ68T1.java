package 剑指offer;

import utils.TreeNode;

public class JZ68T1 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ancestor = root;
        while (true){
            if (ancestor.val<p.val&&ancestor.val<q.val){
                ancestor = ancestor.right;
            }
            else if (ancestor.val>p.val&&ancestor.val>q.val){
                ancestor = ancestor.left;
            }
            else return ancestor;
        }

    }

}
