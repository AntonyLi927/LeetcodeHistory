package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>(); // key - sum  value - count
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                map.put(nums1[i] + nums2[j], map.getOrDefault(nums1[i] + nums2[j], 0) + 1);
            }
        }
        int res = 0;

        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                int temp = nums3[i] + nums4[j];
                if (map.containsKey(0 - temp)) {
                    res += map.get(0 - temp);
                }
            }
        }
        return res;
    }
}
