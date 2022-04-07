package algorithm.SortingAlgorithm;

public class MergeSort {

    public static int[] mergeSort(int[] arr, int left, int right){
        if(left < right){
            int middle = left + (right - left) / 2;
            mergeSort(arr, left, middle);//分
            mergeSort(arr, middle + 1, right);//分
            merge(arr, left, middle, right);//合
        }
        return arr;
    }

    public static void merge(int[] arr, int left, int middle, int right){
        int[] temp = new int[arr.length];
        int rightBegin = middle + 1;
        int leftBegin = left;
        int tempIndex = left;
        while (leftBegin <= middle && rightBegin <= right){
            if (arr[leftBegin] < arr[rightBegin]){
                temp[tempIndex] = arr[leftBegin];
                tempIndex++;
                leftBegin++;
            }
            else {
                temp[tempIndex] = arr[rightBegin];
                tempIndex++;
                rightBegin++;
            }
        }

        while (leftBegin <= middle){
            temp[tempIndex] = arr[leftBegin];
            tempIndex++;
            leftBegin++;
        }

        while (rightBegin <= right){
            temp[tempIndex] = arr[rightBegin];
            tempIndex++;
            rightBegin++;
        }

        for (int i = left; i <= right ; i++) {
            arr[i] = temp[i];
        }

    }

    public static void main(String[] args) {
        int[] test = new int[]{5, 7, 2, 3, 10, 89, 45};
        int[] res = mergeSort(test, 0, 6);
        for (int num : res){
            System.out.println(num);
        }
    }


}
