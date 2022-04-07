package algorithm.SortingAlgorithm;

public class QuickSort {

    public static int[] quickSort(int[] arr){
        QSort(arr, 0, arr.length - 1);
        return arr;
    }

    public static void QSort(int[] arr, int low, int high){
        if (low < high){
            int pivot = partition(arr, low, high);
            QSort(arr, low, pivot - 1);
            QSort(arr, pivot + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        while (low < high){
            while (low < high && arr[high] <= pivot) high--;
            arr[low] = arr[high];
            while (low < high && arr[low] > pivot) low++;
            arr[high] = arr[low];
        }
        arr[low] = pivot;
        return low;
    }

    public static void main(String[] args) {
        int[] test = new int[]{3, 2, 1, 5, 6, 4};
        int[] res = quickSort(test);
        for (int num : res){
            System.out.println(num);
        }
    }
}
