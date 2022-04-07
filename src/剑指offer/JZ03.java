package 剑指offer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JZ03 {
    public static int findRepeatNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i])) return nums[i];
            else map.put(nums[i],nums[i]);
        }
        return 0;
    }
    public static int findRepeatNumber1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int repeat = -1;
        for (int num:nums){
            if (!set.add(num)){
                repeat = num;
                break;
            }
        }
        return repeat;
    }
    public static int findRepeatNumber3(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[nums[i]]++;
            if(arr[nums[i]] > 1) return nums[i];
        }
        return -1;
    }

    public static int findRepeatNumber4(int[] nums) {
       boolean[] mark = new boolean[nums.length];
       for (int i=0;i<nums.length;i++){
           if (!mark[nums[i]]) mark[nums[i]] = true;
           else return nums[i];
       }
       return -1;
    }

    public static int findRepeatNumber5(int[] nums) {
        int i = 0;
        while (i < nums.length){
            if (nums[i] == i){
                i++;
                continue;
            }
            if (nums[nums[i]] == nums[i]) return nums[i];
            int temp = nums[i];
            nums[i] = nums[temp];
            nums[temp] = temp;
        }
        return -1;
    }
}
