package Leetcode;

import com.sun.source.tree.Tree;
import utils.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode106 {
    //[ [左子树的中序遍历结果], 根节点, [右子树的中序遍历结果] ]
    // [ [左子树的后序遍历结果]， [右子树的后序遍历结果]， 根节点]
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return build(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1, map);
    }

    public TreeNode build(int[] inorder, int[] postorder, int inorderBegin, int inorderEnd, int postorderBegin, int postOrderEnd, Map<Integer, Integer> map) {
        if (inorderBegin > inorderEnd || postorderBegin > postOrderEnd || postorderBegin < 0 || inorderBegin < 0 || postOrderEnd > postorder.length - 1 || inorderEnd > inorder.length - 1) return null;
        int rootNum = postorder[postOrderEnd];
        int index = map.get(rootNum);
        TreeNode root = new TreeNode(rootNum);
        root.left = build(inorder, postorder, inorderBegin, index - 1, postorderBegin, postorderBegin + index - inorderBegin - 1, map);
        root.right = build(inorder, postorder, index + 1, inorderEnd, postorderBegin + index - inorderBegin, postOrderEnd - 1, map);
        return root;
    }
}
