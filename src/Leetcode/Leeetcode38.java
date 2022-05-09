package Leetcode;

public class Leeetcode38 {
    public String countAndSay(int n) {
        String s = "1";

        for (int i = 2; i <= n; i++) {
            int start = 0;
            int end = 0;
            StringBuilder stringBuilder = new StringBuilder();
            while (end < s.length()) {
                while (end < s.length() && s.charAt(start) == s.charAt(end)) {
                    end++;
                }
                stringBuilder.append(end - start).append(s.charAt(start));
                start = end;
            }
            s = String.valueOf(stringBuilder);
        }
        return s;
    }
}
