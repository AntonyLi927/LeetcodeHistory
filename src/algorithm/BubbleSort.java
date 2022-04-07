package algorithm;

import java.util.ArrayList;

public class BubbleSort {
    public static int[] sort(int[] sourceArray){

        for (int i = 1; i < sourceArray.length; i++) {
            for (int j = 0; j< sourceArray.length-i;j++){
                if (sourceArray[j]>=sourceArray[j+1]){
                    int temp = sourceArray[j+1];
                    sourceArray[j+1] = sourceArray[j];
                    sourceArray[j] = temp;
                }
            }
        }
        return sourceArray;
    }

    public static int sort(int[] sourceArray, int b){
        for (int i = 1; i < sourceArray.length; i++) {
            for (int j = 0; j< sourceArray.length-i;j++){
                if (sourceArray[j]>=sourceArray[j+1]){
                    int temp = sourceArray[j+1];
                    sourceArray[j+1] = sourceArray[j];
                    sourceArray[j] = temp;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] a = new int[]{3,5,2,1,7,8,0};
        System.out.println(sort(a)[0]);
    }
}
