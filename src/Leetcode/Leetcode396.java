package Leetcode;

import java.util.Arrays;

public class Leetcode396 {

    /**
     * 把数组逆转跟把乘数逆转是一样的，可以看出有如下规律
     *   4     3     2     6
     *
     *  0*4   1*3   2*2   3*6   F(0)
     *
     *  3*4   0*3   1*2   2*6   F(1) = F(0) - SUM(data) + N * data[0];
     *
     *  2*4   3*3   0*2   1*6   F(2) = F(1) - SUM(data) + N * data[1];
     *
     *  1*4   2*3   3*2   0*6   F(3) = F(2) - SUM(data) + N * data[2];
     *
     */

    public int maxRotateFunction(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int f = 0;

        for (int i = 0; i < nums.length; i++) {
            f += i * nums[i];
        }
        int res = f;
        for (int i = 1; i < nums.length; i++) {
            f += nums.length * nums[i - 1] - sum;
            res = Math.max(res, f);
        }
        return res;
    }

    public static void main(String[] args) {
        new Leetcode396().maxRotateFunction(new int[]{1,2,3,4,5,6,7,8,9,10});
    }
}
