package Leetcode;

import utils.TreeNode;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Leetcode113 {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        iterate(root, targetSum, new ArrayList<>());
        return res;
    }

    public void iterate(TreeNode root, int targetSum, List<TreeNode> temp) {
        if (root == null) return;
        if (root.val == targetSum) {
            if (root.left == null && root.right == null) {
                temp.add(root);
                List<Integer> tempRes = new ArrayList<>();
                for (int i = 0; i < temp.size(); i++) {
                    tempRes.add(temp.get(i).val);
                }
                res.add(tempRes);
                temp.remove(root);
            }
        }
        temp.add(root);
        iterate(root.left, targetSum - root.val, temp);
        iterate(root.right, targetSum - root.val, temp);
        temp.remove(root);
    }
}
