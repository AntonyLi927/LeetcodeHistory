package Leetcode;

import java.util.*;

public class Leetcode6047 {
    public String removeDigit(String number, char digit) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                list.add(number.substring(0, i) + number.substring(i + 1));
            }
        }

        Collections.sort(list);
        return list.get(list.size() - 1);
    }

    public static void main(String[] args) {

    }
}
