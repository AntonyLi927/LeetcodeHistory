package Leetcode;

import utils.TreeNode;

public class Leetcode6057 {
    int res = 0;

    public int averageOfSubtree(TreeNode root) {
        post(root);
        return res;
    }

    public int[] post(TreeNode root) {
        int leftCount = 0;
        int rightCount = 0;
       int left = 0;
       int right = 0;
        if (root.left != null) {
            int[] temp = post(root.left);
            left = temp[0];
            leftCount = temp[1];
        }
       if (root.right != null) {
           int[] temp = post(root.right);
           right = temp[0];
           rightCount = temp[1];
       }

       int count = leftCount + rightCount + 1;
       int sum = left + right + root.val;
       if (sum / count == root.val) {
           res++;
       }
       return new int[]{sum, count};
    }
}
