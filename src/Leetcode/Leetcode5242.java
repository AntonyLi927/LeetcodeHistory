package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode5242 {
    public String greatestLetter(String s) {

        /*
        数组统计
         */
        int[] bigCnt = new int[26];   // 大写数目
        int[] smallCnt = new int[26];   // 小写数目
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                // 小写
                smallCnt[c - 'a']++;
            } else {
                // 大写
                bigCnt[c - 'A']++;
            }
        }
        // 倒序遍历
        for (int i = 25; i >= 0; i--) {
            if (bigCnt[i] > 0 && smallCnt[i] > 0) {
                return (char) ('A' + i) + "";
            }
        }
        return "";

    }

    public static void main(String[] args) {
        new Leetcode5242().greatestLetter("lEeTcOdE");



    }
}
