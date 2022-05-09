package Leetcode;

import java.util.*;

public class Leetcode398 {



    class Solution {

        Map<Integer, List<Integer>> map;

        public Solution(int[] nums) {
            map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.get(nums[i]) == null) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    map.put(nums[i], temp);
                } else {
                    List<Integer> temp = map.get(nums[i]);
                    temp.add(i);
                    map.put(nums[i], temp);
                }
            }
        }

        public int pick(int target) {
            List<Integer> temp = map.get(target);
            Random random = new Random();
            return temp.get(random.nextInt(temp.size()));
        }
    }





}
