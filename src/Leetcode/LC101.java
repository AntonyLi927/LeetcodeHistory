package Leetcode;

import utils.TreeNode;

import java.util.LinkedList;

public class LC101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        else return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode root1, TreeNode root2){
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.push(root1);
        linkedList.push(root2);
        while (!linkedList.isEmpty()){
            TreeNode temp1 = linkedList.pollFirst();
            TreeNode temp2 = linkedList.pollFirst();

            if (temp1 == null && temp2 == null) continue;

            if ((temp1 == null || temp2 == null) || temp1.val != temp2.val) return false;

            linkedList.push(temp1.left);
            linkedList.push(temp2.right);

            linkedList.push(temp1.right);
            linkedList.push(temp2.left);
        }
        return true;
    }
}
