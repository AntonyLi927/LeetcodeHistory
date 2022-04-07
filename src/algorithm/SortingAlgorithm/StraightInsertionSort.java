package algorithm.SortingAlgorithm;

public class StraightInsertionSort {

    /**
     * 直接插入排序
     * @param arr
     * @return
     */
    public static int[] sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i]; //哨兵
            int j;
            for (j = i - 1; j >= 0 && temp < arr[j] ; j--) {
                arr[j + 1] = arr[j];//记录后移
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

    /**
     * 直接插入排序的优化：折半插入排序
     * @param arr
     * @return
     */
    public static int[] binaryInsertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]){
                int low = 0;
                int high = i - 1;
                int temp = arr[i];
                int middle = 0;
                while (low <= high){
                    middle = low + (high - low) / 2;
                    if (temp > arr[middle]) low = middle + 1;
                    else if (temp < arr[middle]) high = middle - 1;
                    else {
                        low = middle + 1;
                        break;
                    }
                }
                System.arraycopy(arr, low, arr, low + 1, i - low);
                arr[low] = temp;

            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] test = new int[]{5, 7, 2, 3, 10, 89, 45};
        int[] res = binaryInsertSort(test);
        for (int num : res){
            System.out.println(num);
        }

    }
}
