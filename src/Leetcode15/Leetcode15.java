package Leetcode15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 超时了。。。。。。
 */
public class Leetcode15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if (nums[i]>0) break;
            for (int j=i+1;j<nums.length-1;j++){
                int temp = nums[i]+nums[j];
                for (int k=j+1;k<nums.length;k++){
                    if (temp+nums[k]==0){
                        List<Integer> tempList = new ArrayList<>();
                        tempList.add(nums[i]);
                        tempList.add(nums[j]);
                        tempList.add(nums[k]);
                        if (!result.contains(tempList)) result.add(tempList);
                    }
                }
            }
        }
        return result;
    }
}
