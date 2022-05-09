package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode824 {
    public String toGoatLatin(String sentence) {
        Set<Character> aeiou = new HashSet<>();
        aeiou.add('a');
        aeiou.add('e');
        aeiou.add('i');
        aeiou.add('o');
        aeiou.add('u');
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (aeiou.contains(word.charAt(0))) {
                word += "ma";
            } else {
                if (word.length() != 1) word = word.substring(1, word.length() - 1) + word.charAt(word.length() - 1) + word.substring(0, 1) + "ma";
                else word += "ma";
            }
            for (int j = 0; j <= i; j++) {
                word += "a";
            }
            words[i] = word;
        }
        String res = "";
        for (int i = 0; i < words.length; i++) {
            res += words[i] + " ";
        }
        return res.trim();
    }
}
