package 剑指offer;

public class JZ64 {
    public int sumNums(int n) {
        int res = 0;
        boolean flag = (n>0 && ((res = sumNums(n-1))>0));
        return res+n;
    }

    public static void main(String[] args) {

    }
}
