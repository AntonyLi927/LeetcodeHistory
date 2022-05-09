package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (map.get(num) == null) {
                map.put(num, i);
            } else {
                int len = i - map.get(num);
                if (len <= k) {
                    return true;
                }
                map.put(num, i);
            }
        }
        return false;
    }
}
