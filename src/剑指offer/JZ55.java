package 剑指offer;

import utils.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * 自己做出来的！！！！！！！！
 */
public class JZ55 {


    int max = 0;

    public int maxDepth(TreeNode root) {
        dfs(root,0);
        return max;
    }

    public void dfs(TreeNode root,int length){
        if (root!=null){
            length++;
            dfs(root.left,length);
            dfs(root.right,length);
        }
        else {
            if (length>=max) max = length;
        }

    }

    /**
     * 层序遍历
     * //    作者：jyd
     * //    链接：https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/solution/mian-shi-ti-55-i-er-cha-shu-de-shen-du-xian-xu-bia/
     * //    来源：力扣（LeetCode）
     * //    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param root
     * @return
     */
    public int maxDepth1(TreeNode root) {
        if(root == null) return 0;
        List<TreeNode> queue = new LinkedList<TreeNode>() {{ add(root); }}, tmp;
        int res = 0;
        while(!queue.isEmpty()) {
            tmp = new LinkedList<>();
            for(TreeNode node : queue) {
                if(node.left != null) tmp.add(node.left);
                if(node.right != null) tmp.add(node.right);
            }
            queue = tmp;
            res++;
        }
        return res;
    }




}
