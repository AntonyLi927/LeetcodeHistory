package Leetcode;

import utils.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class Leetcode114 {
    public void flatten(TreeNode root) {
        if (root == null) return;
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode pre = null;
        stack.push(root);
        while (stack.size() != 0){
            TreeNode curr = stack.pop();
            if (pre != null){
                pre.right = curr;
                pre.left = null;
            }
            TreeNode left = curr.left;
            TreeNode right = curr.right;
            if (right != null) stack.push(right);
            if (left != null) stack.push(left);
            pre = curr;
        }
    }
}
