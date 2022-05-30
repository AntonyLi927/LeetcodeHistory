package 剑指offer;

import utils.Node;
import utils.TreeNode;

import javax.management.QueryEval;
import java.util.*;

public class JZ32 {
    public int[] levelOrder(TreeNode root) {
        if (root == null) return new int[0];

        Queue<TreeNode> nodes = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        nodes.add(root);
        int floor = 0;

        while (!nodes.isEmpty()){
            TreeNode temp = nodes.poll();
            res.add(temp.val);
            if (temp.left != null) nodes.add(temp.left);
            if (temp.right != null) nodes.add(temp.right);
        }

        int[] resArray = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resArray[i] = res.get(i);
        }
        return resArray;
    }

    /**
     * JZ32-2
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder2(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> tempList = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--){
                TreeNode temp = queue.poll();
                if (temp.left!=null) queue.add(temp.left);
                if (temp.right!=null) queue.add(temp.right);
                tempList.add(temp.val);
            }
            res.add(tempList);
        }
        return res;
    }

    /**
     * JZ32-3
     * @param root
     * @return
     */

    public List<List<Integer>> levelOrder3(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root != null) deque.add(root);
        while(!deque.isEmpty()) {
            // 打印奇数层
            List<Integer> tmp = new ArrayList<>();
            for(int i = deque.size(); i > 0; i--) {
                // 从左向右打印
                TreeNode node = deque.removeFirst();
                tmp.add(node.val);
                // 先左后右加入下层节点
                if(node.left != null) deque.addLast(node.left);
                if(node.right != null) deque.addLast(node.right);
            }
            res.add(tmp);
            if(deque.isEmpty()) break; // 若为空则提前跳出
            // 打印偶数层
            tmp = new ArrayList<>();
            for(int i = deque.size(); i > 0; i--) {
                // 从右向左打印
                TreeNode node = deque.removeLast();
                tmp.add(node.val);
                // 先右后左加入下层节点
                if(node.right != null) deque.addFirst(node.right);
                if(node.left != null) deque.addFirst(node.left);
            }
            res.add(tmp);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(1 % 2);
    }
}
