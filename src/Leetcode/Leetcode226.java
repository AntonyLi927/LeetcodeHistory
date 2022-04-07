package Leetcode;

import utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() != 0){
            TreeNode temp = queue.poll();
            if (temp.right != null) queue.add(temp.right);
            if (temp.left != null) queue.add(temp.left);
            TreeNode tempChild = temp.left;
            temp.left = temp.right;
            temp.right = tempChild;
        }
        return root;
    }
}
