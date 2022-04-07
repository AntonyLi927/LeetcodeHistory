package Leetcode;

import java.util.*;

public class Leetcode347 {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> times = new HashMap<>();

        for(int i : nums) {
            times.put(i, times.getOrDefault(i, 0) + 1);
        }

        ArrayList<Integer>[] arr = new ArrayList[times.size()];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : times.entrySet()) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(entry.getKey());
            temp.add(entry.getValue());
            arr[i] = temp;
            i++;
        }


        qSort(arr, 0, arr.length - 1);
        int[] res = new int[k];
        for (int j = 0; j < k; j++) {
            res[j] = arr[j].get(0);
        }
        return res;
    }

    public static void qSort(ArrayList<Integer>[] arr, int low, int high) {
        if (low >= high) return;
        int oriLow = low;
        ArrayList<Integer> tempList = arr[low];
        int pivot = arr[low].get(1);
        while (low < high) {
            while (low < high && arr[high].get(1) <= pivot) high--;
            arr[low] = arr[high];
            while (low < high && arr[low].get(1) > pivot) low++;
            arr[high] = arr[low];
        }
        arr[low] = tempList;
        qSort(arr, oriLow, low);
        qSort(arr, low + 1, high);
    }

    public static void main(String[] args) {
        topKFrequent(new int[]{4,1,-1,2,-1,2,3}, 2);
    }
}
