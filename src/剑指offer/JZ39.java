package 剑指offer;

import java.util.HashMap;
import java.util.Map;

public class JZ39 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) map.put(nums[i], 1);
            else {
                int temp = map.get(nums[i]);
                temp++;
                map.remove(nums[i]);
                map.put(nums[i], temp);
                if (temp > (nums.length / 2)) return nums[i];
            }
        }
        return 0;
    }

    public int majorityElement1(int[] nums) {
       int res = 0;
       int vote = 0;
       for (int num : nums){
           if (vote == 0) res = num;
           if (res == num) vote++;
           else vote--;
       }
       return res;
    }
    public static void main(String[] args) {

    }
}
