package Leetcode;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LC102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return null;
        LinkedList<TreeNode> temp = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        temp.push(root);
        while (!temp.isEmpty()){
            int len = temp.size();
            List<Integer> innerRes = new ArrayList<>();
            for (int i = 1; i <= len; i++) {
                TreeNode tempNode = temp.getFirst();
                temp.removeFirst();
                innerRes.add(tempNode.val);
                if (tempNode.left != null) temp.addLast(tempNode.left);
                if (tempNode.right != null) temp.addLast(tempNode.right);
            }
            res.add(innerRes);
        }
        return res;
    }
}
