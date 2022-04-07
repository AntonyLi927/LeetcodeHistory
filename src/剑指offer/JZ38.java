package 剑指offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JZ38 {
    List<String> resList;
    boolean[] vis;
    public String[] permutation(String s) {
        resList = new ArrayList<>();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        StringBuilder stringBuilder = new StringBuilder();
        vis = new boolean[arr.length];
        backtrack(arr, 0, arr.length, stringBuilder);
        String[] res = new String[resList.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = String.valueOf(resList.get(i));
        }
        return res;
    }

    public void backtrack(char[] charArray, int i, int n, StringBuilder str){
        if (i==n){
            resList.add(String.valueOf(str));
            return;
        }

        for (int j = 0; j < n; j++) {
            if (vis[j]||(j>0&&!vis[j-1]&&charArray[j-1]==charArray[j])){
                continue;
            }
            vis[j] = true;
            str.append(charArray[j]);
            backtrack(charArray, i+1, n, str);
            vis[j] = false;
            str.deleteCharAt(str.length()-1);
        }
    }
}
