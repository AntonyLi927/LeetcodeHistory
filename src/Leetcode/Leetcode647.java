package Leetcode;

public class Leetcode647 {
    public int countSubstrings(String s) {
        int count = 0;

        boolean[][] record = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            record[i][i] = true;
        }

        for (int length = 2; length <= s.length(); length++){
            for (int begin = 0; begin < s.length(); begin++) {
                if (begin + length - 1 >= s.length()) break;
                int end = begin + length - 1;
                if (s.charAt(begin) != s.charAt(end)) continue;
                record[begin][end] = end - begin <= 2 || record[begin + 1][end - 1];
                if (record[begin][end]) count++;
            }
        }
        return count + s.length();
    }


    //中心拓展法
    public int countSubstrings2(String s) {
        int count = 0;
        for (int i = 0; i < 2 * s.length() - 1; i++) {
            int left = i / 2;
            int right = i / 2 + i % 2;
            while (left >= 0 && right <= s.length() - 1 && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        boolean[] a = new boolean[3];
        System.out.println(a[0]);
    }
}
