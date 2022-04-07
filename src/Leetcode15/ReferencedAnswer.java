package Leetcode15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 双指针的思想
 */
public class ReferencedAnswer {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length<=2){
            return result;
        }
        Arrays.sort(nums);
        for (int i=0;i<nums.length-2;i++){
            if (nums[i]>0) break;
            if (i>=1&&nums[i]==nums[i-1]) continue;
            int left = i+1;
            int right = nums.length-1;
            while (left<right){
                if (nums[i]+nums[left]+nums[right]==0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    result.add(temp);

                    left++;right--;
                    while (left<right&&nums[left]==nums[left-1]) left++;
                    while (left<right&&nums[right]==nums[right+1]) right--;
                }
                else if (nums[i]+nums[left]+nums[right]<0) left++;
                else right--;
            }
        }
        return result;
    }
}
