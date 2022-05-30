package Leetcode;


import java.rmi.MarshalledObject;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leetcode6048 {
    public int minimumCardPickup(int[] cards) {

        Map<Integer, Integer> lastIndex = new HashMap<>();
        int lengthFromHere = 0;
        int min = Integer.MAX_VALUE;
        boolean has = false;
        for (int i = 0; i < cards.length; i++) {
            Integer index = lastIndex.getOrDefault(cards[i], -1);
            if (i - index > lengthFromHere) {
                lengthFromHere = lengthFromHere + 1;
            } else {
                has = true;
                lengthFromHere = i - index;
                min = Math.min(min, lengthFromHere);
            }
            lastIndex.put(cards[i], i);
        }
        return has ? min + 1 : -1;
    }
}
