package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC46 {
    List<List<Integer>> res;

    public List<List<Integer>> permute(int[] nums) {

        res = new ArrayList<>();
        back(nums, new ArrayList<>(), 0);
        return res;
    }

    public void back(int[] numbers, List<Integer> temp, int length){

        if (length == numbers.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != Integer.MIN_VALUE){
                int tempNum = numbers[i];
                temp.add(tempNum);
                numbers[i] = Integer.MIN_VALUE;
                length++;
                back(numbers, temp, length);
                length--;
                numbers[i] = tempNum;
                temp.remove(temp.size() - 1);
            }
        }
    }
}
