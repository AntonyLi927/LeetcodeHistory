package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode5234 {
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        Map<Character, Integer> temp = new HashMap<>();
        for (int i = 0; i < words[0].length(); i++) {
            temp.put(words[0].charAt(i), temp.getOrDefault(words[0].charAt(i), 0) + 1);
        }
        res.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (!checkDelete(temp, words[i])) {
                res.add(words[i]);
                temp = new HashMap<>();
                for (int j = 0; j < words[i].length(); j++) {
                    temp.put(words[i].charAt(j), temp.getOrDefault(words[i].charAt(j), 0) + 1);
                }

            }
        }
        return res;
    }

    public boolean checkDelete(Map<Character, Integer> map, String word) {
        Map<Character, Integer> tempMap = new HashMap<>(map);
        for (int i = 0; i < word.length(); i++) {
            char temp = word.charAt(i);
            if (tempMap.get(temp) == null) return false;
            int occur = tempMap.get(temp);
            tempMap.put(temp, occur - 1);
        }


        for (Map.Entry<Character, Integer> entry : tempMap.entrySet()) {
            if (entry.getValue() != 0) return false;
        }
        return true;
    }
}
