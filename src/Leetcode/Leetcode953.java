package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode953 {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = order.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], i);
        }
        for (int i = 0; i < words.length - 1; i++) {
            String a = words[i];
            String b = words[i + 1];
            int minLen = Math.min(a.length(), b.length());
            boolean valid = false;
            for (int j = 0; j < minLen; j++) {
                if (map.get(a.charAt(j)) < map.get(b.charAt(j))) {
                    valid = true;
                    break;
                } else if (map.get(a.charAt(j)) > map.get(b.charAt(j))) {
                    return false;
                }
            }
            if (!valid) {
                /* 比较两个字符串的长度 */
                if (words[i].length() > words[i + 1].length()) {
                    return false;
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        new Leetcode953().isAlienSorted(new String[]{"hello","leetcode"},"hlabcdefgijkmnopqrstuvwxyz");
    }
}
