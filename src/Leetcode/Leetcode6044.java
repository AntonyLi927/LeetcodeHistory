package Leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class Leetcode6044 {
    public int[] fullBloomFlowers(int[][] flowers, int[] persons) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i][0] <= min) min = flowers[i][0];
            if (flowers[i][1] >= max) max = flowers[i][1];
        }


        Arrays.sort(flowers, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int[] res = new int[persons.length];
        for (int i = 0; i < persons.length; i++) {
            int time = persons[i];
            int num = 0;
            if (time < min || time > max) continue;
            for (int j = 0; j < flowers.length; j++) {
                if (time < flowers[j][0]) break;
                if (time >= flowers[j][0] && time <= flowers[j][1]) num++;
            }
            res[i] = num;
        }
        return res;
    }
}
