package Leetcode;

import java.util.*;

public class Leetcode6064 {
    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int res = 0;
        int l = bottom;
        int r = special[0] - 1;
        for (int i = 0; i < special.length - 1; i++) {
            res = Math.max(res, r - l + 1);
            l = special[i] + 1;
            r = special[i + 1] - 1;
        }
        res = Math.max(res, r - l + 1);
        return Math.max(res, top - special[special.length - 1]);
    }
}

