package algorithm.SortingAlgorithm;

public class SelectSort {

    public static int[] selectSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int index = i;
            int min = Integer.MAX_VALUE;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min){
                    min = arr[j];
                    index = j;
                }
            }
            arr[i] = arr[index];
            arr[index] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] test = new int[]{5, 7, 2, 3, 10, 89, 45};
        int[] res = selectSort(test);
        for (int num : res){
            System.out.println(num);
        }
    }

}
