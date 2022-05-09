package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode386 {
    List<Integer> res;
    int di = 0;
    public List<Integer> lexicalOrder(int n) {
        int temp = n;

        while (temp > 0) {
            temp /= 10;
            di++;
        }
        res = new ArrayList<>();
        recursion(1, 0, n);
        return res;
    }

    public void recursion(int digit, int num, int n) {

        if (num > n) return;
        else {
            if (num != 0) res.add(num);
        }
        if (digit > di) return;
        for (int i = 0; i <= 9; i++) {
            if (digit == 1 && i == 0) continue;
            recursion(digit + 1, num * 10 + i, n);
        }
    }

    public static void main(String[] args) {
        Leetcode386 leetcode386 = new Leetcode386();
        leetcode386.lexicalOrder(13);
    }
}
