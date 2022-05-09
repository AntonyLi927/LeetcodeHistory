package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode383 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            map1.put(ransomNote.charAt(i), map1.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }
        for (int i = 0; i < magazine.length(); i++) {
            map2.put(magazine.charAt(i), map2.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        for (Map.Entry entry : map2.entrySet()) {
            Character key = (Character) entry.getKey();
            if (map1.get(key) == null) continue;
            if ((int) entry.getValue() >= map1.get(key)) {
                map1.remove(key);
            }
        }
        return map1.size() == 0;
    }

    public static void main(String[] args) {
        canConstruct("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj");
    }
}
