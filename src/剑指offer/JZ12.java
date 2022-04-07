package 剑指offer;

public class JZ12 {
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        int k=0;
        for(int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                if (dfs(board,words,i,j,k)) return true;
            }
        }
        return false;
    }
    public boolean dfs(char[][] board, char[] words, int i, int j, int k){
        if (i<0||i>board.length-1||j<0||j>board[0].length-1||board[i][j]!=words[k]) return false;
        if (k == words.length-1) return true;
        boolean result = false;
        board[i][j] = '\0';
        result = dfs(board,words,i+1,j,k+1)||dfs(board,words,i,j+1,k+1)||dfs(board,words,i-1,j,k+1)||dfs(board,words,i,j-1,k+1);
        board[i][j] = words[k];
        return result;
    }
}
