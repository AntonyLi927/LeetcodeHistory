package Leetcode17;

import java.util.*;

public class Leetcode17 {
    public static List<String> letterCombinations(String digits) {
        Map<Integer,String> keyboard = new HashMap<>();
        keyboard.put(2,"abc");
        keyboard.put(3,"def");
        keyboard.put(4,"ghi");
        keyboard.put(5,"jkl");
        keyboard.put(6,"mno");
        keyboard.put(7,"pqrs");
        keyboard.put(8,"tuv");
        keyboard.put(9,"wxyz");

        List<String> result = new ArrayList<>();
        if (digits.length()==0) return result;
        for (int i=0;i<digits.length();i++){
            result = iterateResult(result, Integer.parseInt(String.valueOf(digits.charAt(i))),keyboard);
        }

        return result;
    }

    public static List<String> iterateResult(List<String> result,Integer num,Map<Integer,String> keyboard){
        List<String> temp = new ArrayList<>();
        if (result.size()==0){
            for (int i=0;i<keyboard.get(num).length();i++){
                temp.add(String.valueOf(keyboard.get(num).charAt(i)));
            }
        }
        else {
            for (String s:result){
                for (int i=0;i<keyboard.get(num).length();i++){
                    temp.add(s+keyboard.get(num).charAt(i));
                }
            }
        }
        System.out.println(temp);
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(Leetcode17.letterCombinations("23"));
    }
}
