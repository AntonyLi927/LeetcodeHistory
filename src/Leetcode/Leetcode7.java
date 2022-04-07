package Leetcode;

public class Leetcode7 {
    public static int reverse(int x) {
        int res = 0;
        while (x != 0) {
            if (res > Integer.MAX_VALUE / 10 || res < Integer.MIN_VALUE / 10) return 0;
            int last = x % 10;
            res = res * 10+ last;
            x = x / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        reverse(123);
    }
}
