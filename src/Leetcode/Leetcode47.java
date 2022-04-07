package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode47 {
    boolean[] visited;

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        visited = new boolean[nums.length];
        Arrays.sort(nums);
        recursion(nums, res, nums.length, new ArrayList<>());
        return res;
    }

    public void recursion(int[] nums, List<List<Integer>> res, int action, List<Integer> temp) {
        if (action == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) {
                continue;
            }
            temp.add(nums[i]);
            visited[i] = true;
            recursion(nums, res, action - 1, temp);
            temp.remove(temp.size() - 1);
            visited[i] = false;
        }
    }
}
