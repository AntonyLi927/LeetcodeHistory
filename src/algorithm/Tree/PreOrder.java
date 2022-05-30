package algorithm.Tree;

import utils.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class PreOrder {

    /**
     * 非递归方法
     */
    public void preOrder(TreeNode root){
        LinkedList<TreeNode> temp = new LinkedList<>();
        while (root != null || !temp.isEmpty()){
            while (root != null){
                System.out.println(root.val);
                temp.push(root);
                root = root.left;
            }
            if (!temp.isEmpty()){
                TreeNode tempNode = temp.pop();
                root = tempNode.right;
            }
        } 
    }


}
