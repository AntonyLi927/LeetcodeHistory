package Leetcode3;

import utils.ListNode;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode3 {
    public static int lengthOfLongestSubstring(String s){
        ArrayList<String> a = new ArrayList<>();
        int interval = 0;
        int count = 0;
        int[] result = new int[s.length()+1];
        if (s.equals("")){
            return interval;
        }
        result[0]=0;
        for (interval=1;interval<=s.length();interval++){
            for (int i=0;i<s.length()-interval+1;i++){
                for (int j=i;j<i+interval;j++){
                    for(int b=j+1;b<interval+i;b++){
                            if (s.charAt(b)==s.charAt(j)){
                                count++;
                            }
                    }
                }
                if (count==0){
                    result[interval]++;
                }
                else {
                    count=0;
                }
            }
        }
        int temp=0;
        for (int i=0;i<result.length;i++){
            System.out.println(result[i]);
            if (result[i]!=0){
                temp=i;
            }
        }

        return temp;
    }
    public static void main(String[] args){
        System.out.println(Leetcode3.lengthOfLongestSubstring("jeufutixpjlqvaotuwemehuxsdkpotpyzjdtcostxdkvfaozwuocdkavnmkefzeeijamxsixyusduiftcvvgfxbvjozqndv"));
    }
}
/**
 * 运行结果正确但时间过长，提交不成功。。。。。。。
 * */