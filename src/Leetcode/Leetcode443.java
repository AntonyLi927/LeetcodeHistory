package Leetcode;

public class Leetcode443 {
    public int compress(char[] chars) {
        String s = "";
        int left = 0;
        int right = 0;
        int count = 0;
        char temp = chars[0];
        while (right < chars.length) {
            if (chars[right] == temp) {
                count++;
                right++;
            } else {
                s += temp;
                if (count != 1) {
                    s += count;
                }
                left = right;
                temp = chars[left];
                count = 0;
            }
        }

        s += temp;
        if (count != 1) {
            s += count;
        }
        char[] res = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
           res[i] = s.charAt(i);
        }

        return res.length;

    }

    public static void main(String[] args) {
        new Leetcode443().compress(new char[]{'a','a','b','b','c','c','c'});
    }
}
