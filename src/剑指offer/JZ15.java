package 剑指offer;

public class JZ15 {
    public static int hammingWeight(int n) {
        int res = 0;
        while (n!=0){ //原始代码使n>0 但无法通过所有情况
            res = res+(n&1);
            n=n>>>1;
        }
        return res;
    }

    public static void main(String[] args) {
        hammingWeight(11);
    }
}
