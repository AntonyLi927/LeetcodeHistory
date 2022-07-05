package Leetcode;

public class Leetcode28 {
    public int strStr(String haystack, String needle) {

        int res = -1;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int len = 1;
                for (int j = 1; j < needle.length(); j++) {
                    if (i + j >= haystack.length()) break;
                    if (haystack.charAt(i + j) == needle.charAt(j)) {
                        len++;
                    } else {
                        break;
                    }
                }
                if (len == needle.length()) {
                    res = i;
                    return res;
                } else {
                    res = -1;
                }
            }
        }
        return res;
    }
}

