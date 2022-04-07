package Leetcode;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode199 {

    Map<Integer, TreeNode> treeMap = new HashMap<>();

    public List<Integer> rightSideView(TreeNode root) {
        dfs(root, 1);
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= treeMap.size(); i++) {
            res.add(treeMap.get(i).val);
        }
        return res;
    }

    public void dfs(TreeNode root, int level) {
        if (root != null) {
            if (treeMap.get(level) == null) treeMap.put(level, root);
            dfs(root.right, level + 1);
            dfs(root.left, level + 1);
        }
    }
}
