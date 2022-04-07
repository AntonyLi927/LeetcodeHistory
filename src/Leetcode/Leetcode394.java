package Leetcode;

public class Leetcode394 {
    public String decodeString(String s) {
        Object[] recursion = recursion(s, 0);
        return (String) recursion[0];
    }

    public Object[] recursion(String s, int start) {
        int a = 1; // 该层子串重复次数
        String numStr = "";
        String subStr = "";
        for (int i = start; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                numStr += s.charAt(i);
//                a = Character.getNumericValue(s.charAt(i));
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                subStr += s.charAt(i);
            } else if (s.charAt(i) == '[') {
                a = Integer.parseInt(numStr); // 下一个递归返回的子字符串需要循环几次
                Object[] objs = recursion(s, i + 1); //进行下一次递归
                for (int j = 1; j <= a; j++) {
                    subStr += objs[0];
                } // 拼接字符串
                numStr = ""; // 将当前数字清零
                i = (int) objs[1]; // 下一次递归返回的]在字符串中所处位置
            } else {
                return new Object[]{subStr, i};
            }
        }
        return new Object[]{subStr, s.length() - 1};
    }
}
