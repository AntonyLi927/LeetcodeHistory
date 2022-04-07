package Leetcode;

import java.util.Arrays;

public class Leetcode455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int r = g.length - 1;
        int res = 0;
        for (int i = s.length - 1; i >= 0; i--) {
            int num = s[i];
            for (int j = r; j >= 0; j--) {
                if (num >= g[j]) {
                    r = j - 1;
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}
