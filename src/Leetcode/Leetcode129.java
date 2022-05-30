package Leetcode;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode129 {


    static int res = 0;

    public static int sumNumbers(TreeNode root) {
        dfs(root, "");
        return res;
    }

    public static void dfs(TreeNode root, String number) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            res += Integer.parseInt(number + root.val);
            return;
        }

        dfs(root.left, number + root.val);
        dfs(root.right, number + root.val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        sumNumbers(root);
    }

}
