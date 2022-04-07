package Leetcode;

import utils.TreeNode;

public class LC96 {

//    TreeNode root;
//
//    public int numTrees(int n) {
//        int[] arr = new int[n + 1];
//        recur(arr, 1);
//    }
//
//    public void recur(int[] arr, int begin){
//        for (int i = begin; i <= arr.length - 1; i++) {
//            if (arr[i] != -1){
//
//            }
//        }
//    }
//
//    public void insert(int val){
//        root = insertNode(root, val);
//    }
//
//    public TreeNode insertNode(TreeNode root, int val){
//    }

    /**
     * 这题用动态规划
     */

    public int numTrees(int n) {
        int[] g = new int[n + 1];
        g[0] = 1;
        g[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                g[i] = g[i] + g[j - 1] * g[i - j];
            }
        }
        return g[n];
    }
}
