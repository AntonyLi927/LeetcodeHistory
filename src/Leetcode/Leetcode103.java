package Leetcode;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Leetcode103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        Deque<TreeNode> deque = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        deque.push(root);
        int level = 1;
        while (!deque.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int s = deque.size();
            if (level % 2 != 0){
                for (int i = 0; i < s; i++) {
                    TreeNode tempNode = deque.getFirst();
                    temp.add(tempNode.val);
                    deque.removeFirst();
                    if (tempNode.left != null) deque.addLast(tempNode.left);
                    if (tempNode.right != null) deque.addLast(tempNode.right);
                }
                level++;
                res.add(temp);
            } else {
                for (int i = 0; i < s; i++) {
                    TreeNode tempNode = deque.getLast();
                    temp.add(tempNode.val);
                    deque.removeLast();
                    if (tempNode.right != null) deque.addFirst(tempNode.right);
                    if (tempNode.left != null) deque.addFirst(tempNode.left);
                }
                level++;
                res.add(temp);
            }
        }
        return res;
    }
}
