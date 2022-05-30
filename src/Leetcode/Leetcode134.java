package Leetcode;

public class Leetcode134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int i = 0;
        while (i < gas.length) {
            int gasAdd = 0;
            int gasCost = 0;
            int count = 0;
            while (count < gas.length) {
                gasAdd += gas[(i + count) % gas.length];
                gasCost += cost[(i + count) % gas.length];
                if (gasCost > gasAdd) break;
                count++;
            }

            if (count == gas.length) {
                return i;
            } else {
                i = i + count + 1;
            }
        }
        return -1;
    }
}
