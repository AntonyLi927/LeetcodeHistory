package Leetcode;

public class JZ2_006 {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }

    public int[] twoSum1(int[] numbers, int target) {
        int[] res = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int low = i + 1;
            int high = numbers.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (numbers[mid] + numbers[i] == target) {
                    res[0] = i;
                    res[1] = mid;
                    return res;
                } else if (numbers[mid] + numbers[i] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return res;
    }
}
