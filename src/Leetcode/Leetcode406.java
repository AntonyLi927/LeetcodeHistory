package Leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class Leetcode406 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]){
                    return o1[0] - o2[0];
                } else {
                    return o2[1] - o1[1];
                }
            }
        });

        int[][] res = new int[people.length][];

        for (int i = 0; i < people.length; i++) {
            int space = people[i][1] + 1;
            int j;
            for (j = 0; j < people.length; j++) {
                if (res[j] == null) {
                    space--;
                    if (space == 0) {
                        res[j] = people[i];
                        break;
                    }
                }
            }

        }

        return res;
    }
}
