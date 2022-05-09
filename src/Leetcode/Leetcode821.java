package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode821 {
        public int[] shortestToChar(String s, char c) {
                List<Integer> index = new ArrayList<>();
                int[] res = new int[s.length()];
                for (int i = 0; i < s.length(); i++) {
                        if (s.charAt(i) == c) {
                                index.add(i);
                        }
                }

                for (int i = 0; i < s.length(); i++) {
                        char temp = s.charAt(i);
                        if (temp == c) {
                                res[i] = 0;
                                continue;
                        }
                        int min = Integer.MAX_VALUE;
                        for (int j = 0; j < index.size(); j++) {
                                if (Math.abs(index.get(j) - i) <= min) min = Math.abs(index.get(j) - i);
                        }
                        res[i] = min;
                }
                return res;
        }
}