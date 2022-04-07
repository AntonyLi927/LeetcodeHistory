package Test;

import java.util.*;

public class HKUDemo {

    public static String[] sort(String[] input) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            list.add(input[i]);
        }

        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            input[i] = list.get(i);
        }
        return input;
    }


    public static int findMissing(int[] arr) {
        int targetSum = (1 + 1000) * 1000 / 2;
        for (int i = 0; i < arr.length; i++) {
            targetSum -= arr[i];
        }
        return targetSum;
    }


    public static void main(String[] args) {

    }



}
