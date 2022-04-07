package Leetcode;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LC94 {

    List<Integer> res = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        mid(root);
        return res;
    }

    public void mid(TreeNode root){
        if (root == null) return;
        mid(root.left);
        res.add(root.val);
        mid(root.right);
    }

}
