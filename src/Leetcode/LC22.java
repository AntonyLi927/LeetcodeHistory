package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC22 {
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        generate(new StringBuilder(), n, n, 0);
        return res;
    }

    public void generate(StringBuilder s, int leftNum, int rightNum, int rec){
        if (leftNum == 0 && rightNum == 0){
            res.add(s.toString());
            return;
        }

        if (leftNum > 0){
            s = s .append("(");
            generate(s, leftNum - 1, rightNum, rec + 1);
            s.deleteCharAt(s.length() - 1);
        }

        if (rightNum > 0 && rec > 0){
            s = s .append(")");
            generate(s, leftNum, rightNum - 1, rec - 1);
            s.deleteCharAt(s.length() - 1);
        }
        
        return;
    }
}
