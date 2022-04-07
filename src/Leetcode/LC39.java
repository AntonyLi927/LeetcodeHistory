package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC39 {

    List<List<Integer>> res;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         res = new ArrayList<>();
         int sum = 0;
         back(candidates, 0, target, new ArrayList<>(), sum);
         return res;
    }


    public void back(int[] candidates,int begin, int target, List<Integer> temp, int sum){//注意这个地方加个begin的作用，因为元素是可以重复使用的，
        // 因此如果不加这个begin的限制可能会出现重复的结果，加上begin后每次开始都是在begin这个位置开始循环

        if (sum > target) return;

        if (sum == target){
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = begin; i < candidates.length; i++) {

            sum += candidates[i];
            temp.add(candidates[i]);

            back(candidates, i, target, temp, sum);

            sum -= candidates[i];
            temp.remove(temp.size() - 1);

        }
        return;
    }
}
