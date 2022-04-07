package 剑指offer;

public class JZ11 {
    public static int minArray(int[] numbers) {
        int min = numbers[0];
        for (int i=1;i<numbers.length;i++){
            if (numbers[i]<=min) min = numbers[i];
        }
        return min;
    }
    public static int minArray1(int[] numbers) {
        int a = 0;
        int b = numbers.length-1;
        while (a<b){
            int pivot = a+(b-a)/2;
            if (numbers[pivot]>numbers[b]){
                a = pivot+1;
            }else if (numbers[pivot]<numbers[b]){
                b = pivot;
            }else {
                b--;
            }
        }
        return numbers[b];
    }
    public static int minArray2(int[] numbers) {
        int low = 0;
        int high = numbers.length-1;
        while (low<high){
            int pivot = low+(high-low)/2;
            if (numbers[pivot]<numbers[high]) {
                high = pivot;
            }
            else if (numbers[pivot]>numbers[high]){
                low = pivot+1;
            }
            else {
                high--;
            }
        }
        return numbers[low];
    }
}
