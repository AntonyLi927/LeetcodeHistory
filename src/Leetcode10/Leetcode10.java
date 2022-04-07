package Leetcode10;
/*
* 提交失败哈哈哈
* */
public class Leetcode10 {
    public static boolean isValid(String s) {
        boolean result = false;
        int last = (int)s.charAt(s.length()-1);
        if (last==40||last==91||last==123) return false;
        for (int i=0;i<s.length()-1;i++){
            int temp = (int)s.charAt(i);
            if (temp==40){
                for (int j=i+1;j<s.length();j++){
                    if ((int)s.charAt(j)==41){
                        result = true;
                        break;
                    }
                    else result = false;
                }

            }
            else if (temp == 91){
                for (int j=i+1;j<s.length();j++){
                    if ((int)s.charAt(j)==93){
                        result = true;
                        break;
                    }
                    else result = false;
                }

            }
            else if (temp == 123){
                for (int j=i+1;j<s.length();j++){
                    if ((int)s.charAt(j)==125){
                        result = true;
                        break;
                    }
                    else result = false;
                }

            }
            else continue;
        }
        return result;
    }
    public static void main(String[] args) {
        /*
        * ) 41
        * ( 40
        * [ 91
        * ] 93
        * { 123
        * } 125
        * */
        System.out.println(isValid("(){}{"));
    }
}
