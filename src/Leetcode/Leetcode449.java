package Leetcode;

import utils.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Leetcode449 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postOrder(root, list);
        String s = list.toString();
        return s.substring(1, s.length() - 1);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("")) return null;
        String[] strings = data.split(", ");
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < strings.length; i++) {
            stack.push(Integer.valueOf(strings[i]));
        }
        return construct(Integer.MIN_VALUE, Integer.MAX_VALUE, stack);
    }

    public void postOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        postOrder(root.left, list);
        postOrder(root.right, list);
        list.add(root.val);
    }

    public TreeNode construct(int lower, int upper, Deque<Integer> stack) {
        if (stack.isEmpty() || stack.peek() < lower || stack.peek() > upper) {
            return null;
        }

        TreeNode root = new TreeNode(stack.pop());
        root.right = construct(root.val, upper, stack);
        root.left = construct(lower, root.val, stack);
        return root;
    }

}
