package 剑指offer;

public class JZ04 {
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length==0) return false;
        if (matrix[0].length == 0) return false;
        int row = 0;
        int col = matrix[0].length-1;
        while (row<=matrix.length-1&&col>=0){
            if (target>matrix[row][col]){
                row++;
                continue;
            }
            else if (target == matrix[row][col]){
                return true;
            }
            else {
                col--;
                continue;
            }
        }
        return false;
    }


    public static boolean findNumberIn2DArray1(int[][] matrix, int target) {

        int row = 0;
        int col = matrix[0].length-1;
        while (row < matrix.length && col >= 0){
            if (target < matrix[row][col]){
                col--;
            }
            else if (target > matrix[row][col]){
                row++;
            }
            else return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int[][] matrix = new int[][]{};
        System.out.println(matrix.length);
        System.out.println(findNumberIn2DArray(matrix,11));
    }
}
