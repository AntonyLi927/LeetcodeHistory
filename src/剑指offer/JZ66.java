package 剑指offer;

public class JZ66 {
    /**
     * 超时了
     * @param a
     * @return
     */
    public int[] constructArr(int[] a) {
        int[] res = new int[a.length];
        for (int i=0;i<a.length;i++){
            int temp = 1;
            for (int j=0;j<a.length;j++){
                if (j!=i) temp = temp*a[j];
            }
            res[i] = temp;
        }
        return res;
    }

    /**
     * 评论里的
     * @param a
     * @return
     */
    public int[] constructArr1(int[] a) {
        int n = a.length;
        int[] B = new int[n];
        for (int i = 0, product = 1; i < n; product *= a[i], i++)       /* 从左往右累乘 */
            B[i] = product;
        for (int i = n - 1, product = 1; i >= 0; product *= a[i], i--)  /* 从右往左累乘 */
            B[i] *= product;
        return B;
    }
    public static void main(String[] args) {

    }
}
