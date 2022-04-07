package 剑指offer;

public class JZ33 {
    /**
     * 只考虑了一个根节点的左子树都小于此根节点的值，右子树大于根节点的值，需要递归考虑所有的根节点
     * @param postorder
     * @return
     */
    public static boolean verifyPostorder(int[] postorder) {
        if (postorder.length == 0) return true;
        boolean consecutiveLow = true;
        boolean consecutiveHigh = false;
        int top = postorder[postorder.length-1];
        int lowCount = 0;
        for (int i = 0; i < postorder.length-1; i++) {
            if (consecutiveHigh == true && consecutiveLow == true) return false;
            if (postorder[i]<top){
                consecutiveLow = true;
                lowCount++;
            }
            else {
                if (lowCount%2==0&&lowCount!=0) return false;
                else {
                    consecutiveHigh = true;
                    consecutiveLow = false;
                }
            }
        }
        if (consecutiveHigh == true && consecutiveLow == true) return false;
        else return true;
    }

    public  boolean verifyPostorder1(int[] postorder) {
        return recur(postorder, 0 , postorder.length-1);
    }

    public boolean recur(int[] postorder, int i, int j){
        if (i>=j) return true;
        int p = i;
        while (postorder[p]<postorder[j]) p++;
        int m = p;
        while (postorder[p]>postorder[j]) p++;

        return p == j && recur(postorder, i, m-1)&&recur(postorder, m , j-1);
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,5,10,6,9,4,3};
        verifyPostorder(a);
    }
}
