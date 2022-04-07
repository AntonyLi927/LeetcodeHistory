package 剑指offer;

public class JZ62 {
    public int lastRemaining(int n, int m) {
        boolean[] arr = new boolean[n];
        int index = 0;
        int count = 0;
        while (true){
            if (index >= n) index = index % n;
            if (arr[index] == true){
                count++;
                if (count == n - 1) break;
                index++;
                continue;
            }
            else {
                for (int i = 1; i < m; i++) {
                    if (index >= n) index = index % n;
                    if (arr[index] == true){
                        i--;
                        index++;
                        continue;
                    }
                    index++;
                }
                if (index >= n) index = index % n;

                arr[index] = true;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == false) return i;
        }
        return 0;
    }
}
