package 剑指offer;

import java.util.EventListener;

public class JZ67 {
    public static int strToInt(String str) {
        str = str.trim();
        if (str.length()<=0) return 0;
        char f = str.charAt(0);
        boolean positive = true;
        String res = "";
        if (f=='-') positive = false;
        else if (f=='+'){
            positive = true;
        }
        else if (('0'<=f&&f<='9')){
            positive = true;
            res = res + f;
        }
        else return 0;

        for (int i=1;i<str.length();i++){
            char temp = str.charAt(i);
            if ('0'<=temp&&temp<='9'){
                if (res.equals("")){
                    res = res+temp;
                    continue;
                }

                if ((Integer.parseInt(res) > Integer.MAX_VALUE/10) || ((Integer.parseInt(res) == Integer.MAX_VALUE/10 && temp > '7'))){
                    if (positive) return Integer.MAX_VALUE;
                    else return Integer.MIN_VALUE;
                }
                else res = res+temp;
            }
            else {
                break;
            }
        }
        if (res.isEmpty()) return 0;
        if (positive) return Integer.parseInt(res);
        else return -Integer.parseInt(res);

    }

    public static void main(String[] args) {
        System.out.println(strToInt("2147483646"));
    }

}
