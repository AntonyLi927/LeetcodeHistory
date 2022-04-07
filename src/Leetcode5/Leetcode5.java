package Leetcode5;

import java.util.ArrayList;
/**
 *
 * 超时了..................................
 * */
public class Leetcode5 {
    public static String longestPalindrome(String s) {
        ArrayList<String> qualifiedArray = new ArrayList<>();
        for (int i = 0;i < s.length(); i++){
            for (int j = i+1; j<s.length();j++){
                int temp1 = i;
                int temp2 = j;
                int count = 0;
                while (temp1<=temp2){
                    if (s.charAt(temp1)==s.charAt(temp2)){
                        temp1++;
                        temp2--;
                        count++;
                    }
                    else {
                        break;
                    }
                }
                if ((j-i)/2 + 1 ==count){
                    qualifiedArray.add(s.substring(i,j+1));
                }
                else {
                    continue;
                }
            }

        }

        int maxSize = 0;
        int resultIndex = 0;
        if (qualifiedArray.size() == 0) {
            return s.substring(0,1);
        }
        else {
            for(int i=qualifiedArray.size()-1;i>=0;i--){
                if (qualifiedArray.get(i).length()>=maxSize){
                    maxSize=qualifiedArray.get(i).length();
                    resultIndex = i;
                }
            }
            return qualifiedArray.get(resultIndex);
        }
    }

    public static void main(String[] args) {
        System.out.println(Leetcode5.longestPalindrome("aabbcc"));
    }
}
