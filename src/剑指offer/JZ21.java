package 剑指offer;

public class JZ21 {
    public static int[] exchange(int[] nums) {
        int[] res = new int[nums.length];
        int odd = 0;
        int even = nums.length-1;
        for (int i =0;i<nums.length;i++){
            if (nums[i]%2!=0){
                res[odd] = nums[i];
                odd++;
            }
            else {
                res[even] = nums[i];
                even--;
            }
        }
        return res;
    }
    public static int[] exchange1(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while (left<right){
            if (nums[left]%2!=0){
                left++;
                continue;
            }
            else if (nums[right]%2==0){
                right--;
                continue;
            }
            else {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
            }
        }
        return nums;
    }

    /**
     * 双指针
     * @param nums
     * @return
     */
    public static int[] exchange2(int[] nums) {
        int slow = 0;
        int fast = 0;
        while (fast<nums.length){
            if (nums[fast]%2!=0){
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow++;
            }
            fast++;
        }
        return nums;
    }
}
