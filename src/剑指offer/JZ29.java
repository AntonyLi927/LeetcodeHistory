package 剑指offer;

public class JZ29 {

    public static int[]  spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return new int[0];
       int left = 0;
       int right = matrix[0].length - 1;
       int top = 0;
       int bottom = matrix.length - 1;
       int[] res = new int[(right + 1) * (bottom + 1)];
       int index = 0;
       while (true){
           for (int i = left; i <= right; i++) {
                res[index] = matrix[top][i];
                index++;
           }
           top++;
           if ( top > bottom) break;

           for (int i = top; i <= bottom ; i++) {
               res[index] = matrix[i][right];
               index++;
           }
           right--;
           if (left > right) break;

           for (int i = right; i >= left ; i--) {
               res[index] = matrix[bottom][i];
               index++;
           }
            bottom--;
           if (top > bottom) break;

           for (int i = bottom; i >= top ; i--) {
               res[index] = matrix[i][left];
               index++;
           }
           left++;
           if (left > right) break;

       }
       return res;
    }

    public static void main(String[] args) {
        int[][] a = new int[3][3];
        a[0] = new int[]{1,2,3};
        a[1] = new int[]{4,5,6};
        a[2] = new int[]{7,8,9};
        spiralOrder(a);
    }
}
