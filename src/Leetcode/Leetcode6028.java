package Leetcode;

public class Leetcode6028 {
    public static int countCollisions(String directions) {
        int res = 0;
        char prev = 'B';

            for (int i = 0; i < directions.length(); i++) {
                char cur = directions.charAt(i);
                if (cur == 'L') {
                    if (prev == 'R') {
                        res += 2;
                        prev = 'S';
                        for (int j = i - 2; j >= 0; j--) {
                            if (directions.charAt(j) == 'R') res++;
                            else break;
                        }
                    } else if (prev == 'S') {
                        res++;
                        prev = 'S';
                    }
                } else if (cur == 'R') {
                    prev = 'R';
                } else if (cur == 'S') {
                    if (prev == 'R') {
                        res++;
                        for (int j = i - 2; j >= 0; j--) {
                            if (directions.charAt(j) == 'R') res++;
                            else break;
                        }
                    }
                    prev = 'S';
                } else {
                    prev = cur;
                }
            }

        return res;
    }

    public static void main(String[] args) {
        countCollisions("RLRSLL");
    }
}
