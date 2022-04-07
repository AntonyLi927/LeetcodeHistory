package 剑指offer;

import utils.TreeNode;

public class JZ26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A==null||B==null) return false;
        return recur(A,B)||isSubStructure(A.left,B)||isSubStructure(A.right,B);
    }

    public boolean recur(TreeNode t1, TreeNode t2){
        if (t2==null) return true;
        if (t1==null||t1.val!=t2.val) return false;
        return recur(t1.left,t2.left)&&recur(t1.right,t2.right);
    }
}
