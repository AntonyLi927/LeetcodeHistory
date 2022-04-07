package 剑指offer;

import java.util.HashSet;
import java.util.Set;

public class JZ56 {
    public int[] singleNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if (set.contains(temp)) set.remove(temp);
            else set.add(temp);
        }

        int[] result = new int[set.size()];
        int i = 0;
        for (Integer integer : set){
            result[i] = integer;
            i++;
        }
        return result;
    }

    public int[] singleNumbers1(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            n ^= nums[i];
        }

        int div = 1;
        while((div & n) == 0){
            div = div << 1;
        }

        int a = 0,b = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & div) == 0 ){
                a ^= nums[i];
            } else {
                b ^= nums[i];
            }
        }

        return new int[]{a, b};
    }

    public int singleNumber2(int[] nums) {
        int[] bitArr = new int[32];
        int bitMask = 1;
        for (int i = 0; i < bitArr.length; i++) {
            for (int j = 0; j < nums.length; j++){
                if ((bitMask & nums[j]) == bitMask){
                    bitArr[i]++;
                }
            }
            bitMask = bitMask << 1;
        }

        for (int i = 0; i < 32; i++) {
            bitArr[i] = bitArr[i] % 3;
        }

        int res = 0;
        for (int i = 31; i >= 0; i--) {
            res <<= 1;
            res |= bitArr[i];
        }

        return res;
    }

}
