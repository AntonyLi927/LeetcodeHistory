package Leetcode;

import java.util.Arrays;

public class Leetcode581 {


    /**
     * 这是一个关于官方第二个一次遍历题解的自己的理解：
     *
     * 从前往后遍历，同时记录一个当前为止最大值max和一个右指针。
     * 只有当遇到num[i] < max时，才移动右指针，因为最后一段数组的所有的值都要大于前面数组的值且是递增的；当num[i] >= max时，更新max值。
     *
     * 从后往前遍历，同时记录一个当前为止最小值min和一个左指针。
     * 只有当遇到num[i] > max时，才移动左指针，因为第一段数组的所有的值都要小于后面数组的值且是递减的，一旦遇到一个num[i]大于当前min了，证明这个数也应当被放在第二段中；
     * 当num[i] <= min，更新min值。
     *
     */






    public int findUnsortedSubarray(int[] nums) {
        if (isSorted(nums)) {
            return 0;
        }

        int[] sortedNums = new int[nums.length];
        System.arraycopy(nums, 0, sortedNums, 0, nums.length);
        Arrays.sort(sortedNums);
        int left = 0;
        while (left < nums.length && nums[left] == sortedNums[left]) left++;

        int right = nums.length - 1;
        while (right > left && nums[right] == sortedNums[right]) right--;

        return right - left + 1;
    }



    public boolean isSorted(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1]) return false;
        }
        return true;
    }
}
