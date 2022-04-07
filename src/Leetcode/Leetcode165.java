package Leetcode;

public class Leetcode165 {
    public static int compareVersion(String version1, String version2) {
        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");
        int len1 = arr1.length;
        int len2 = arr2.length;

        for (int i = 0; i < Math.min(len1, len2); i++) {
            int val1 = Integer.parseInt(removeZero(arr1[i]));
            int val2 = Integer.parseInt(removeZero(arr2[i]));

            if (val1 > val2) return 1;
            else if (val1 < val2) return -1;
        }

        if (len1 == len2) return 0;

        if (len1 > len2) {
            for (int i = len2; i < len1; i++) {
                if (Integer.parseInt(removeZero(arr1[i])) > 0) return 1;
            }
            return 0;
        } else {
            for (int i = len1; i < len2; i++) {
                if (Integer.parseInt(removeZero(arr2[i])) > 0) return -1;
            }
            return 0;
        }

    }

    public static String removeZero(String s) {
        String res = "";
        boolean preZero = true;
        for (int i = 0; i < s.length(); i++) {
            if (preZero && s.charAt(i) == '0') continue;
            else {
                preZero = false;
                res += s.charAt(i);
            }
        }
        return res.equals("") ? "0" : res;
    }

    public static void main(String[] args) {
        compareVersion("1", "1.1");
    }
}
