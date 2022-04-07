package algorithm.SortingAlgorithm;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr){
        for (int i = 1; i <= arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * 优化
     * @param arr
     * @return
     */
    public static int[] bubbleSort1(int[] arr){
        boolean swapMark = true;
        int indexMark = arr.length - 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (swapMark){
                swapMark = false;
                for (int j = 0; j < (arr.length - 1 - i < indexMark ? arr.length - 1 - i : indexMark) ; j++) {
                    if (arr[j] > arr[j + 1]){
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapMark = true;
                        indexMark = j;
                    }
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] test = new int[]{1, 2, 4, 3};
        int[] res = bubbleSort(test);
        for (int num : res){
            System.out.println(num);
        }
    }
}
