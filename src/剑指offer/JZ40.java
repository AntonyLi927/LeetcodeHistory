package 剑指offer;

public class JZ40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        QSort(arr, 0, arr.length - 1, k);
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    public void QSort(int[] arr, int left, int right, int k){
        if (left < right){
            int pivot = partition(arr, left, right);
            if (pivot == k) return;
            QSort(arr, left, pivot - 1, k);
            QSort(arr, pivot + 1, right, k);
        }
    }

    public int partition(int[] arr, int left, int right){

        int mark = arr[left];
        while (left < right){
            System.out.println("here");
            while (left < right && arr[right] >= mark) right--;
            arr[left] = arr[right];
            while (left < right && arr[left] <= mark) left++;
            arr[right] = arr[left];
        }
        arr[left] = mark;
        return left;
    }

    public static void main(String[] args) {
        int[] test = new int[]{0,1,2,1};
        int[] res = new JZ40().getLeastNumbers(test,4);
        for (int num : test){
            System.out.println(num);
        }
    }


}
