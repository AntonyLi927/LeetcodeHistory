package Leetcode3;

import java.util.HashSet;
import java.util.Set;

public class ReferencedAnswer3 {
    public static int lengthOfLongestSubstring(String s){
        Set<Character> characterSet = new HashSet<>();
        int r = 0;
        int result = 0;
        for (int i=0;i<s.length();i++){
            if (i!=0){
                characterSet.remove(s.charAt(i-1));
            }
            while (r<s.length()&&!characterSet.contains(s.charAt(r))){
                characterSet.add(s.charAt(r));
                r++;
            }
            result = Math.max(result, r-i);
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(ReferencedAnswer3.lengthOfLongestSubstring("jeufutixpjlqvaotuwemehuxsdkpotpyzjdtcostxdkvfaozwuocdkavnmkefzeeijamxsixyusduiftcvvgfxbvjozqndv"));
    }
}
