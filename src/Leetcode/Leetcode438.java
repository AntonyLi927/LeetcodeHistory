package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode438 {


    /**
     * 超时
     * @param
     */

//    public static List<Integer> findAnagrams(String s, String p) {
//        char[] chars = p.toCharArray();
//        List<Character> charList = new ArrayList<>();
//        List<Integer> res = new ArrayList<>();
//        for (int i = 0; i < chars.length; i++) {
//            charList.add(chars[i]);
//        }
//
//
//        for (int i = 0; i < s.length(); i++) {
//            if (recursion(s, i, charList)){
//                res.add(i);
//            }
//        }
//
//        return res;
//    }
//
//    public static boolean recursion(String s, int index, List<Character> charList) {
//        if (charList.size() == 0) return true;
//
//        if (index >= s.length()) {
//            if (charList.size() > 0) return false;
//            else return true;
//        }
//        char tempChar = s.charAt(index);
//        if (charList.indexOf(tempChar) >= 0) {
//            charList.remove(charList.indexOf(tempChar));
//            boolean tempRes = recursion(s, index + 1, charList);
//            charList.add(tempChar);
//            return tempRes;
//        } else {
//            return false;
//        }
//
//    }

    public List<Integer> findAnagrams(String s, String p) {
        if (s.length() < p.length()) return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int[] sArr = new int[26];
        int[] pArr = new int[26];

        for (int i = 0; i < p.length(); i++) {
            sArr[s.charAt(i) - 'a']++;
            pArr[p.charAt(i) - 'a']++;
        }

        if (Arrays.equals(sArr, pArr)) {
            res.add(0);
        }

        for (int i = 0; i < s.length() - p.length(); i++) {
            sArr[s.charAt(i) - 'a']--;
            sArr[s.charAt(i + p.length()) - 'a']++;

            if (Arrays.equals(sArr, pArr)) {
                res.add(i + 1);
            }
        }

        return res;
    }
    public static void main(String[] args) {
        //findAnagrams("cbaebabacd", "abc");
    }



}
