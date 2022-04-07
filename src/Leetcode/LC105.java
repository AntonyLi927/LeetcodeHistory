package Leetcode;

import utils.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class LC105 {
    Map<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }


        return build(preorder, inorder, 0, inorder.length - 1, 0, inorder.length - 1);
    }


    public TreeNode build(int[] preorder, int[] inorder, int preorderBegin, int preOrderEnd,
                          int inorderBegin, int inorderEnd){
        if (preorderBegin > preOrderEnd || inorderBegin > inorderEnd || preorderBegin < 0 || preOrderEnd >= preorder.length || inorderBegin < 0 || inorderEnd >= inorder.length) return null;



        int rootNum = preorder[preorderBegin];
        int inorderIndex = map.get(rootNum);
        int leftLength = inorderIndex - inorderBegin;
        TreeNode root = new TreeNode(rootNum);
        root.val = rootNum;
        root.left = build( preorder, inorder, preorderBegin + 1, preorderBegin + leftLength,
                inorderBegin, inorderIndex - 1);
        root.right = build(preorder, inorder, preorderBegin + leftLength +1,
                preOrderEnd, inorderIndex + 1, inorderEnd);
        return root;

    }

}
