package Leetcode;

public class LC55 {

    /**
     * 超时了
     */
//    public boolean canJump(int[] nums) {
//        return dfs(nums, 0);
//    }
//
//    public boolean dfs(int[] nums, int i){
//        if (i >= nums.length - 1) return true;
//        if (nums[i] == 0) return false;
//        boolean res = false;
//        for (int j = 1; j <= nums[i]; j++) {
//            res = dfs(nums, i + j);
//            if (res == true) break;
//        }
//        return res;
//    }

    public boolean canJump(int[] nums) {
        int mostRemote = 0;
        for (int i = 0; i < mostRemote ; i++) {
            mostRemote = Math.max(mostRemote, i + nums[i]);
            if (mostRemote >= nums.length - 1) return true;
        }
        return false;
    }
}
