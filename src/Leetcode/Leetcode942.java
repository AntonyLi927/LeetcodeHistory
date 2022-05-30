package Leetcode;

public class Leetcode942 {
    public int[] diStringMatch(String s) {
        int[] perm = new int[s.length() + 1];
        int low =  0;
        int high = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                perm[i] = low;
                low++;
            } else {
                perm[i] = high;
                high--;
            }
        }
        perm[s.length()] = low;
        return perm;
    }
}
