package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode90 {


    List<List<Integer>> res = new ArrayList<>();
    boolean[] visited;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        visited = new boolean[nums.length];
        Arrays.sort(nums);
        recur(nums, new ArrayList<>(), 0);
        return res;
    }


    public void recur(int[] nums, List<Integer> temp, int start) {
        res.add(new ArrayList<>(temp));

        for (int i = start; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) {
                continue;
            }
            visited[i] = true;
            temp.add(nums[i]);
            recur(nums, temp, i + 1);
            temp.remove(temp.size() - 1);
            visited[i] = false;

        }
    }

    public static void main(String[] args) {
        new Leetcode90().subsetsWithDup(new int[]{1,2,2});
    }



}
