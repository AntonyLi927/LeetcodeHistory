package Leetcode;

import java.util.*;

public class Leetcode380 {
    class RandomizedSet {

        List<Integer> nums;
        Map<Integer, Integer> indices;
        Random random;

        public RandomizedSet() {
           nums = new ArrayList<>();
           indices = new HashMap<>();
           random = new Random();
        }

        public boolean insert(int val) {
           if (indices.get(val) != null) {
               return false;
           }
           indices.put(val, nums.size());
           nums.add(val);
           return true;
        }

        public boolean remove(int val) {
            if (indices.get(val) == null) {
                return false;
            }
            int index = indices.get(val);
            int num = nums.get(nums.size() - 1);
            nums.set(index, num);
            indices.put(num, index);
            indices.remove(val);
            nums.remove(nums.size() - 1);
            return true;
        }

        public int getRandom() {
            int rand = random.nextInt(nums.size());
            return nums.get(rand);
        }
    }
}
