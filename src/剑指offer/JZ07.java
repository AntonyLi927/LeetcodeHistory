package 剑指offer;

import utils.TreeNode;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class JZ07 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        stack.push(root);
        int inorderIndex = 0;
        for (int i = 1; i < preorder.length; i++) {
            int preorderVal = preorder[i];
            TreeNode node = stack.peek();
            if (node.val != inorder[inorderIndex]) {
                node.left = new TreeNode(preorderVal);
                stack.push(node.left);
            } else {
                while (!stack.isEmpty() && stack.peek().val == inorder[inorderIndex]) {
                    node = stack.pop();
                    inorderIndex++;
                }
                node.right = new TreeNode(preorderVal);
                stack.push(node.right);
            }
        }
        return root;
    }
    // 作者：LeetCode-Solution
    //    链接：https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/solution/mian-shi-ti-07-zhong-jian-er-cha-shu-by-leetcode-s/
    //    来源：力扣（LeetCode）
    //    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

    Map<Integer, Integer> inorderMap;
    public TreeNode buildTree1(int[] preorder, int[] inorder) {
        inorderMap = new HashMap<>();
        for (int i=0;i<inorder.length;i++){
            inorderMap.put(inorder[i],i);
        }
        return recursiveBuildTree(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }

    public TreeNode recursiveBuildTree(int[] preorder, int[] inorder, int preorderStart, int preorderEnd, int inorderStart, int inorderEnd ){
        if(preorderStart > preorderEnd){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preorderStart]);

        int inorderIndex = inorderMap.get(preorder[preorderStart]);
        int leftTreeLength = inorderIndex - inorderStart;

        root.left = recursiveBuildTree(preorder,inorder,preorderStart+1,preorderStart+leftTreeLength,inorderStart,inorderIndex-1);
        root.right = recursiveBuildTree(preorder,inorder,preorderStart+leftTreeLength+1,preorderEnd,inorderIndex+1,inorderEnd);
        return root;
    }

}
