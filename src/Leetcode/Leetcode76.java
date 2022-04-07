package Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Leetcode76 {

    Map<Character, Integer> tMap = new HashMap<>();
    Map<Character, Integer> sMap = new HashMap<>();

    public String minWindow(String s, String t) {
        int left = 0;
        int right = 0;
        int min = Integer.MAX_VALUE;
        int resL = -1;
        int resR = -1;

        for (int i = 0; i < t.length(); i++) {
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }
        int length = 0;
        while (right < s.length()){
            sMap.put(s.charAt(right), sMap.getOrDefault(s.charAt(right), 0) + 1);
            while (check() && left <= right) {
                if (right - left + 1 <= min) {
                    min = right - left + 1;
                    resL = left;
                    resR = right + 1;
                }
                sMap.put(s.charAt(left), sMap.getOrDefault(s.charAt(left), 0) - 1);
                left++;
            }
            right++;
        }
        return resL == -1 ? "" : s.substring(resL, resR);
    }

    public boolean check() {
        Set<Map.Entry<Character, Integer>> entries = tMap.entrySet();
        for (Map.Entry entry : entries) {
            if (sMap.getOrDefault(entry.getKey(), 0) < (int) entry.getValue()) return false;
        }
        return true;
    }
}
