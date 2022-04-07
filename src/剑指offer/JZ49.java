package 剑指offer;

public class JZ49 {
    /**
     * 超时了。。。。。。。。
     * @param n
     * @return
     */
    public static int nthUglyNumber(int n) {
        if (n==1) return 1;
        int res = 2;
        for (int i = 2; i <= n; i++) {
            if (!recursive(res)){
                i--;
                res++;
            }
            else res++;
        }
        return res-1;
    }

    public static boolean recursive(int num){
        boolean res2 = false;
        boolean res3 = false;
        boolean res5 = false;
        if (num==1) return true;
        if (num%2==0) {
            res2 = recursive(num/2);
        }
        else if (num%3==0) {
            res3 = recursive(num/3);
        }
        else if (num%5==0){
            res5 = recursive(num/5);
        }
        else return false;
        return res2||res3||res5;
    }

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(1352));
    }


}
