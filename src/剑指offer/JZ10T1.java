package 剑指offer;

public class JZ10T1 {
    public static int fib(int n) {
        if(n<=1) return n;
        int f = 0, s = 1, result=0;
        for (int i=1;i<n;i++){
            result = (f + s)%1000000007;
            f = s;
            s = result;
        }
        return result;
    }

    public static int fib1(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else {
            int result = fib1(n-1)+fib1(n-2);
            if (result>1000000007) result = result%1000000007;
            return result ;
        }
    }

    public static void main(String[] args) {
        System.out.println(fib(45));
    }
}

