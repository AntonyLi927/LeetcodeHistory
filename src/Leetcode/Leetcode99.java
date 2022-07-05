package Leetcode;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode99 {
    public void recoverTree(TreeNode root) {
        List<Integer> inorderList = new ArrayList<>();
        inorder(root, inorderList);
        int[] target = findTarget(inorderList);
        swap(root, inorderList.get(target[0]), inorderList.get(target[1]));
    }

    public void inorder(TreeNode root, List<Integer> inorderList) {
        if (root == null) return;

        inorder(root.left, inorderList);
        inorderList.add(root.val);
        inorder(root.right, inorderList);
    }

    public int[] findTarget(List<Integer> list) {

        int index1 = -1;
        int index2 = -1;


        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) < list.get(i)) {
                index2 = i + 1;
                if (index1 == -1) {
                    index1 = i;
                } else {
                    break;
                }
            }
        }
        return new int[] {index1, index2};
    }

    public void swap(TreeNode root, Integer val1, Integer val2) {
        if (root.val == val1 || root.val == val2) {
            root.val = root.val == val1 ? val2 : val1;
        }

        if (root.left != null) swap(root.left, val1, val2);
        if (root.right != null) swap(root.right, val1, val2);
    }

}
