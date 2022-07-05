package Leetcode;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class JZ2_055 {
    class BSTIterator {

        List<TreeNode> inorderList;
        int index;

        public BSTIterator(TreeNode root) {
            inorderList = new ArrayList<>();
            index = -1;
            inorderIterate(root, inorderList);
        }

        public int next() {
            index++;
            TreeNode treeNode = inorderList.get(index);
            return treeNode.val;
        }

        public boolean hasNext() {
            return index < inorderList.size();
        }

        public void inorderIterate(TreeNode root, List<TreeNode> inorderList) {
            if (root == null) {
                return;
            }
            inorderIterate(root.left, inorderList);
            inorderList.add(root);
            inorderIterate(root.right, inorderList);
        }
    }
}
