package Leetcode;

public class Leetcode1089 {
    public void duplicateZeros(int[] arr) {
        int len = arr.length;
        int top = 0;
        int i = -1;
        while (top < len) {
            i++;
            if (arr[i] != 0) {
                top++;
            } else {
                top += 2;
            }
        }

        int j = len - 1;
        if (top == len + 1) { // 如果最后一个数是0，则top+=2会超出len - 1， 所以要做以下操作
            arr[j] = 0;
            j--;
            i--;
        }


        while (j >= 0) {
            arr[j] = arr[i];
            j--;
            if (arr[i] == 0) {
                arr[j] = arr[i];
                j--;
            }
            i--;
        }

    }

    public static void main(String[] args) {
        new Leetcode1089().duplicateZeros(new int[]{1,0,2,3,0,4,5,0});
    }
}
