package 剑指offer;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class JZ28 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return false;
        Deque<TreeNode> queue = new LinkedList<>();
       
        queue.addLast(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.pop();
            if (node.left != null) queue.addLast(node.left);
            if (node.right != null) queue.addLast(node.right);
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
        }



        return true;

    }
}
