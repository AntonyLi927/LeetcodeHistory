package 剑指offer;

import utils.ListNode;
import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class JZ34 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<Integer> temp = new ArrayList<>();
        dfs(root, target, temp);
        return res;
    }

    public void dfs(TreeNode root, int target, List<Integer> temp){
        if (root == null) return;
        temp.add(root.val);

        if (root.left == null && root.right == null){
            int sum = 0;
            for(Integer i : temp){
                sum += i;
            }
            if (sum == target){
                res.add(new ArrayList<>(temp));
            }
        }
        dfs(root.left, target, temp);
        dfs(root.right, target, temp);
        temp.remove(temp.size() - 1);



    }
}
