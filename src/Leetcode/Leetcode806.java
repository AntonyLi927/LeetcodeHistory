package Leetcode;

public class Leetcode806 {
    public int[] numberOfLines(int[] widths, String s) {

        int cap = 100;
        int line = 0;
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (widths[index] <= cap) {
                cap -= widths[index];
            } else {
                cap = 100 - widths[index];
                line++;
            }
            if (cap == 0) {
                cap = 100;
                line++;
            }
        }
        return new int[] {line, 100 - cap};
    }
}
