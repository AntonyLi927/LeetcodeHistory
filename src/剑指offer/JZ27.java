package 剑指offer;

import com.sun.source.tree.Tree;
import utils.TreeNode;

import javax.lang.model.util.Elements;
import java.util.Deque;
import java.util.LinkedList;

public class JZ27 {
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null) return null;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.getFirst();
            if (node.left != null) queue.addLast(node.left);
            if (node.right != null) queue.addLast(node.right);
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
        return root;
    }
}
