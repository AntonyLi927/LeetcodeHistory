package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode93 {

    static List<String> res = new ArrayList<>();

    public static List<String> restoreIpAddresses(String s) {
        int numLeft = 3;
        recursion(s, numLeft, 0, "");
        return res;
    }

    public static void recursion(String s, int numLeft, int begin, String tempStr) {
        int end = begin + 1;
        if (numLeft == 0) {
            try {
                if (Integer.parseInt(s.substring(begin)) > 255) {
                }
                else {
                    if (s.substring(begin).startsWith("0") && begin < s.length() - 1) return;
                    tempStr += s.substring(begin);
                    res.add(tempStr);
                }
            } catch (Exception e) {
                return;
            } finally {
                return;
            }


        }

        while (end < s.length()) {
            if (Integer.parseInt(s.substring(begin, end)) <= 255) {
                if (s.substring(begin, end).startsWith("0") && end - begin > 1) return;
                recursion(s, numLeft - 1, end, tempStr + s.substring(begin, end) + ".");
                end++;
            } else {
                return;
            }
        }
        return;
    }

    public static boolean isValid(String s) {
        String[] strings = s.split("\\.");
        for (int i = 0; i < strings.length; i++) {
            String tempStr = strings[i];
            if (tempStr.startsWith("0") && tempStr.length() > 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        restoreIpAddresses("101023");
    }
}
