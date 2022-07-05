package Leetcode;

public class Leetcode1108 {
    public String defangIPaddr(String address) {
        String[] arr = address.split("\\.");
        String res = "";
        for (int i = 0; i < arr.length - 1; i++) {
            res += arr[i] + "[.]";
        }

        res += arr[3];
        return res;
    }
}
