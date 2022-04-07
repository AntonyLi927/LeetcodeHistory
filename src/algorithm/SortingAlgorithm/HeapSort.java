package algorithm.SortingAlgorithm;

public class HeapSort {

    public void heapSort(int[] arr){
        //建立大顶堆
        for (int i = (arr.length - 2) / 2; i >= 0 ; i--) {
            sift(arr, i, arr.length - 1);
        }

        //堆排序
        for (int i = 0; i < arr.length - 1; i++) {
            swap(arr, 0, arr.length - 1 - i); //未排序的堆的最后一个元素与大顶堆的第一个元素交换
            sift(arr, 0, arr.length - 2 - i);
        }

    }

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void sift(int[] arr, int low, int high){
        int root = low; //记录要进行调整的堆的根节点
        while (root * 2 + 1 <= high){
            int biggerIndex = root * 2 + 1;
            //找出根节点的左右子树中的较大值并将biggerIndex指向更大值
            if (biggerIndex < high){
                if (arr[biggerIndex] < arr[biggerIndex + 1]) {
                    biggerIndex = biggerIndex + 1;
                }
            }
            //将根节点与较大值交换，并进行下一次循环
            if (arr[root] < arr[biggerIndex]){
                swap(arr, root, biggerIndex);
                root = biggerIndex;
            }
            else {
                break;
            }
        }
    }
}

