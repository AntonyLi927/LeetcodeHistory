package Leetcode5;

public class ReferencedAnswer5A1 {
    public static String longestPalindrome(String s) {
        int length = s.length();
        boolean[][] matrix = new boolean[length][length];
        String result = "";

        for (int l=0;l<length;l++){
            for (int i=0;i<length-l;i++){
                int j = i + l;
                if (l==0){
                    matrix[i][j] = true;
                }
                else if (l==1){
                    matrix[i][j] = (s.charAt(i)==s.charAt(j));
                }
                else {
                    matrix[i][j] = matrix[i+1][j-1]&&(s.charAt(i)==s.charAt(j));
                }
                if (matrix[i][j]==true&&l+1>result.length()){
                    result = s.substring(i,j+1);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Leetcode5.longestPalindrome("aabbcc"));
    }
}
