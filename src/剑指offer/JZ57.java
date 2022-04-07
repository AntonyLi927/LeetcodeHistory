package 剑指offer;

public class JZ57 {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j){
            if (nums[i] + nums[j] > target) j--;
            else if (nums[i] + nums[j] < target) i++;
            else return new int[]{nums[i], nums[j]};
        }
        return null;
    }
}
