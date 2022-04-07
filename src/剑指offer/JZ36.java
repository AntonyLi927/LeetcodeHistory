package 剑指offer;

import utils.Node;
import utils.TreeNode;

public class JZ36 {
    /**
     * 中序遍历就是从大到小遍历
     * @param root
     * @return
     */
    TreeNode head,pre;
    public TreeNode treeToDoublyList(TreeNode root) {
        if (root == null) return null;
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    public void dfs(TreeNode root){
        if (root == null) return;
        dfs(root.left);
        if(pre != null) pre.right = root;
        else head = root;
        root.left = pre;
        pre = root;
        dfs(root.right);






    }
}
