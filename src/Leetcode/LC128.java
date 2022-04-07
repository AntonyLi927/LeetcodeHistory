package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class LC128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> integers = new HashSet<>();

        for (int i : nums){
            integers.add(i);
        }

        int maxLength = 0;

        for (Integer i : integers){
            int tempLength = 1;
            if (!integers.contains(i - 1)){
                while (integers.contains(i + 1)) {
                    i++;
                    tempLength++;
                }
                maxLength = Integer.max(tempLength, maxLength);
            }
        }
        return maxLength;
    }
}
