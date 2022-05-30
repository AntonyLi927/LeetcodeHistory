package Leetcode;

public class Mianshiti0105 {
    public boolean oneEditAway(String first, String second) {
        int l1 = 0;
        int l2 = 0;
        int r1 = first.length() - 1;
        int r2 = second.length() - 1;
        while (l1 <= r1 && l2 <= r2) {
            if (first.charAt(l1) == second.charAt(l2)) {
                l1++;
                l2++;
                continue;
            }
            if (first.charAt(r1) == second.charAt(r2)) {
                r1--;
                r2--;
                continue;
            }
            break;
        }

        return r1 - l1 + r2 - l2 <= 0 && Math.abs(l1 - l2) <= 1 && Math.abs(r1 - r2) <= 1;
    }
}
