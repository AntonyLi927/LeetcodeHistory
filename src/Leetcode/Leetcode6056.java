package Leetcode;

public class Leetcode6056 {
    public String largestGoodInteger(String num) {
        String res = "";
        for (int i = 0; i < num.length() - 2; i++) {
            if (checkValid(num.substring(i, i + 3))) {
                if (res == "") {
                    res = num.substring(i, i + 3);
                } else {
                    res = String.valueOf(Math.max(Integer.parseInt(res), Integer.parseInt(num.substring(i, i + 3))));
                }
            }
        }
        return res.equals("0") ? "000" : res;
    }

    public boolean checkValid(String s) {
        if (s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2)) {
            return true;
        } else return false;
    }
}

