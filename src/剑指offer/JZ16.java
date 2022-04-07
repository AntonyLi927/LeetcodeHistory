package 剑指offer;

public class JZ16 {
    public static double myPow(double x, int n) {
        if (x == 0 ) return 0.0;
        double res = 1;
        long m = n;
        if (m<0){
            x = 1/x;
            m = -m;
        }
        while (m!=0){
            if ((m&1)==1) res = res*x;
            x = x*x;
            m = m>>>1;
        }
        return res;
    }
}
