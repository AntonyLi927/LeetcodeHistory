package Leetcode;

public class Leetcode875 {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for (int i = 0; i < piles.length; i++) {
            high = Math.max(high, piles[i]);
        }
        int res = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int time = getTime(mid, piles);
            if (time <= h) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }

    public int getTime(int speed, int[] piles) {
        int time = 0;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] % speed == 0) {
                time += piles[i] / speed;
            } else {
                time += piles[i] / speed + 1;
            }
        }
        return time;
    }

}
