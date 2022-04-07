package 剑指offer;

public class JZ42 {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (nums[i - 1] < 0){
                max = Math.max(nums[i], max);
                continue;
            }
            else {
                nums[i] += nums[i - 1];
                max = Math.max(nums[i], max);
            }

        }
        return max;
    }
}
