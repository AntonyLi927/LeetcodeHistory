package Leetcode;

public class Leetcode461 {
    public int hammingDistance(int x, int y) {
        int a = x ^ y;
        int res = 0;
        while (a != 0) {
            int temp = a & 1;
            if (temp == 1) {
                res++;
            }
            a = a >> 1;
        }
        return res;
    }
}
