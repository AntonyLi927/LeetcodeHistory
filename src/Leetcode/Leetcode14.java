package Leetcode;

public class Leetcode14 {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        for (int i = 0; i < strs[0].length(); i++) {
            char temp = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != temp) {
                    return res;
                }
            }
            res += temp;
        }
        return res;
    }
}
