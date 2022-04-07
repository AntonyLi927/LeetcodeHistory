package algorithm.SortingAlgorithm;

public class TreeSort {

    class Node{
        int val; // value of the node
        Node left;// left children node
        Node right;// right children node
        //constructor
        public Node(int val){
            this.val = val;
        }
    }

    Node root;

    public TreeSort(){
        root = null;
    }

    public void insert(int val){
        root = insertNode(root, val);
    }

    public Node insertNode(Node root, int val){
         /* If the tree is empty,
        return a new node */
        if (root == null)
        {
            root = new Node(val);
            return root;
        }
        /* Otherwise, recur
        down the tree */
        if (val < root.val)
            root.left = insertNode(root.left, val);
        else if (val > root.val)
            root.right = insertNode(root.right, val);

        /* return the root */
        return root;
    }

    public void treein(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
    }

    public void recur(Node root){
        if (root != null){
            recur(root.left);
            System.out.println(root.val);
            recur(root.right);
        }
    }

    public static void main(String[] args) {
        TreeSort treeSort = new TreeSort();
        treeSort.treein(new int[]{5, 7, 2, 3, 10, 89, 45});
        treeSort.recur(treeSort.root);
    }
}
