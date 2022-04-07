package Leetcode;

import java.util.*;

public class LC49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs){
            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            String newStr = new String(temp);
            List<String> stringList = map.getOrDefault(newStr, new ArrayList<String>());
            stringList.add(str);
            map.put(newStr, stringList);
        }
        return new ArrayList<>(map.values());
    }
}
