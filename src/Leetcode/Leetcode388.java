package Leetcode;

public class Leetcode388 {
    public int lengthLongestPath(String input) {
        int res = 0;
        int pos = 0;
        int dest = input.length() - 1;
        int[] level = new int[dest + 2];

        while (pos <=  dest) {
            int dep = 1;
            while (pos <= dest && input.charAt(pos) == '\t') {
                pos++;
                dep++;
            }

            int len = 0;
            boolean isFile = false;
            while (pos <= dest && input.charAt(pos) != '\n') {
                if (input.charAt(pos) == '.') isFile = true;
                pos++;
                len++;
            }

            pos++; // 跳过\n
            if (dep > 1) {
                len += level[dep - 1] + 1;
            }
            if (isFile) {
                res = Math.max(res, len);
            } else {
                level[dep] = len;
            }

        }
        return res;
    }
}
