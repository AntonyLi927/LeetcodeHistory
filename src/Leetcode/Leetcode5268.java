package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode5268 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> num1Set = new HashSet<>();
        Set<Integer> num2Set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            num1Set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            num2Set.add(nums2[i]);
        }
        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();

        for (Integer i : num1Set) {
            if (!num2Set.contains(i)) res1.add(i);
        }
        for (Integer i : num2Set) {
            if (!num1Set.contains(i)) res2.add(i);
        }
        res.add(res1);
        res.add(res2);
        return res;


    }
}
