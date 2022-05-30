package Leetcode;

public class Leetcode43 {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        String res = "";
        for (int i = num2.length() - 1; i >= 0; i--) {
            StringBuffer stringBuffer = new StringBuffer();
            int add = 0;
            for (int j = num2.length() -1; j > i; j--) {
                stringBuffer.append("0");
            }
            int number2 = num2.charAt(i) - '0';
            for (int j = num1.length() - 1; j >= 0; j--) {
                int number1 = num1.charAt(j) - '0';
                int temp = number1 * number2 + add;
                stringBuffer.append(temp % 10);
                add = temp / 10;
            }

            if (add != 0) {
                stringBuffer.append(add);
            }

            res = addStrings(res, stringBuffer.reverse().toString());
        }
        return res;
    }

    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int add = 0;
        StringBuffer res = new StringBuffer();
        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int temp = x + y + add;
            res.append(temp % 10);
            add = temp / 10;
            i--;
            j--;
        }
        return  res.reverse().toString();
    }
}
