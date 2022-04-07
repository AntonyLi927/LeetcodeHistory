package 剑指offer;

import java.util.*;

public class JZ48 {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lastIndex = new HashMap<>();
        int max = 0;
        int lengthFromHere = 0;
        for (int i = 0; i < s.length(); i++) {
            int j = lastIndex.getOrDefault(s.charAt(i), -1);
            lengthFromHere = lengthFromHere < i - j ? lengthFromHere + 1 : i - j;
            lastIndex.put(s.charAt(i), i);
            max = Math.max(max, lengthFromHere);
        }
        return max;
    }

    public String googleOA(String s){
        if (s == null || s.length() == 0) return new String();
        Map<Character, Integer> firstIndex = new HashMap<>();
        int maxLength = 0;
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            int j = firstIndex.getOrDefault(s.charAt(i), i);
            int tempLength;
            if (j == i){
                firstIndex.put(s.charAt(i), i);
                tempLength = 1;
            } else {
                tempLength = i - j + 1;
            }

            if (tempLength > maxLength){
                maxLength = tempLength;
                if (i != s.length() - 1) res = s.substring(j, i + 1);
                else res = s.substring(j);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = new int[]{0, 1,};
        System.out.println(a);
    }

}


