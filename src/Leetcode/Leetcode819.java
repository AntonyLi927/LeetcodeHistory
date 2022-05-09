package Leetcode;

import java.util.*;

public class Leetcode819 {
    public static String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap();
        StringBuffer sb = new StringBuffer();
        int length = paragraph.length();
        Set<String> bannedSet = new HashSet<>();
        for (String word : banned) {
            bannedSet.add(word);
        }

        for (int i = 0; i <= length; i++) {
            if (i < length && Character.isLetter(paragraph.charAt(i))) {
                sb.append(Character.toLowerCase(paragraph.charAt(i)));
            } else if (sb.length() > 0) {
                String word = sb.toString();
                map.put(word, map.getOrDefault(word, 0) + 1);
                sb.setLength(0);
            }
        }


        int max = 0;
        String res = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= max) {
                boolean isValid = true;
                for (int i = 0; i < banned.length; i++) {
                    if (entry.getKey() .equals(banned[i])) isValid = false;
                }
                if (isValid) {
                    max = entry.getValue();
                    res = entry.getKey();
                }

            }
        }
        return res;
    }

    public static void main(String[] args) {
        mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"});
    }
}
