package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode187 {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String temp = s.substring(i, i + 10);
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }

        List<String> res = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                res.add(entry.getKey());
            }
        }
        return res;
    }


}

