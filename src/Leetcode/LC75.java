package Leetcode;

public class LC75 {
    public void sortColors(int[] nums) {
        int slow = 0;
        for (int i = 0; i <= 2; i++) {
            int fast = slow + 1;
            while (true && fast < nums.length){
                if (nums[slow] == i){
                    slow++;
                    fast++;
                }
                else break;
            }

            while (fast < nums.length){
                if (nums[fast] == i){
                    int temp = nums[slow];
                    nums[slow] = nums[fast];
                    nums[fast] = temp;
                    slow++;
                    fast++;
                }
                else{
                    fast++;
                }
            }
        }
    }
}
