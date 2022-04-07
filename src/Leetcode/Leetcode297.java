package Leetcode;

import utils.TreeNode;

import java.util.*;

public class Leetcode297 {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null){
            return "x";
        }

        String left = serialize(root.left);
        String right = serialize(root.right);

        return root.val + "," + left + "," + right;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] split = data.split(",");
        List<String> list = new ArrayList<>(Arrays.asList(split));
        return dfs(list);
    }

    public TreeNode dfs(List<String> list){
        String currentVal = list.get(0);
        list.remove(0);
        if (currentVal.equals("x")) return null;
        TreeNode root = new TreeNode();
        root.val = Integer.parseInt(currentVal);

        root.left = dfs(list);
        root.right = dfs(list);

        return root;

    }

}
