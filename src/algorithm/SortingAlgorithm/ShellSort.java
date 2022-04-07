package algorithm.SortingAlgorithm;

/**
 * 希尔排序
 */
public class ShellSort {

    public static int[] shellSort(int[] arr){
        for (int i = arr.length / 2; i >= 1 ; i /= 2) {
            for (int j = i; j < arr.length; j++) {
                int temp = arr[j];//==========================
                if (arr[j] < arr[j - i]){
                    int k;
                    for (k = j - i; k >= 0 && arr[k] > temp; k -= i) {
                        arr[k + i] = arr[k];
                    }
                    arr[k + i] = temp;
                }
                //============================================相当于做了一次直接插入排序
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] test = new int[]{5, 7, 2, 3, 10, 89, 45, 5};
        int[] res = shellSort(test);
        for (int num : res){
            System.out.println(num);
        }
    }

}
