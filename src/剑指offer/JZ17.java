package 剑指offer;

import java.util.Arrays;

public class JZ17 {
    public static int[] printNumbers(int n) {
        int max = (int) Math.pow(10,n);
        int[] res = new int[max-1];
        for (int i=1;i<max;i++){
            res[i-1] = i;
        }
        return res;
    }

    public static void main(String[] args) {
        char[] a = new char[2];
        a[0] = '1';
        a[1] = '2';
        System.out.println(""+String.valueOf(a));
    }
}
