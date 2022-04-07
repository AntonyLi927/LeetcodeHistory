package Leetcode;

import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.Map;

public class LC3 {
    /**
     * 同剑指48题
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lastIndex = new HashMap<>();
        int lengthFromHere = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            int j = lastIndex.getOrDefault(s.charAt(i), -1);
            lengthFromHere = lengthFromHere < i - j ? lengthFromHere + 1 : i - j;
            lastIndex.put(s.charAt(i), i);
            max = Math.max(max, lengthFromHere);
        }

        return max;
    }


    /**
     * 2022-2-9 做第二遍
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring1(String s) {
        Map<Character, Integer> lastIndex = new HashMap<>();
        int lengthFromHere = 0;
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            Integer index = lastIndex.getOrDefault(s.charAt(i), -1);
            lengthFromHere = i - index > lengthFromHere ? lengthFromHere + 1 : i - index;
            lastIndex.put(s.charAt(i), i);
            maxLength = Math.max(maxLength, lengthFromHere);
        }
        return maxLength;
    }
}
