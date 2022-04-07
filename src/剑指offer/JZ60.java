package 剑指offer;

public class JZ60 {
    public static double[] dicesProbability(int n) {
        double[] res = new double[]{1.0/6.0,1.0/6.0,1.0/6.0,1.0/6.0,1.0/6.0,1.0/6.0,};
        for (int i = 2; i <= n; i++){
            double[] temp = new double[5*i+1];
            for (int k = 0; k < res.length; k++){
                for (int j = 0; j <= 5; j++){
                    if (k+j<=5*i) temp[k+j] = temp[k+j]+res[k]*1.0/6.0;
                }
            }
            res = temp;
        }
        return res;
    }

    public static void main(String[] args) {
        dicesProbability(2);
    }
}
