package Leetcode;

import java.util.*;

public class Leetcode6042 {
    public int countLatticePoints(int[][] circles) {
        //List<int[]> dots = new ArrayList<>();
        Map<Integer, Set<Integer>> dots = new HashMap<>();
        for (int i = 0; i < circles.length; i++) {
            int x = circles[i][0];
            int y = circles[i][1];
            int r  =circles[i][2];
            for (int j = y + r; j >= y - r; j--){
                for (int k = x - r; k <= x + r; k++) {
                    if (check(x, y, k, j, r) && !isExist(k, j, dots)){
                        if (dots.get(k) != null) dots.get(k).add(j);
                        else {
                            Set<Integer> set = new HashSet<>();
                            set.add(j);
                            dots.put(k, set);
                        }
                    }
                }
            }
        }
        int res = 0;
        for (Map.Entry<Integer, Set<Integer>> entry : dots.entrySet()) {
            res += entry.getValue().size();
        }
        return res;
    }

    public boolean isExist(int dotX, int dotY, Map<Integer, Set<Integer>> dots) {
        if (dots.get(dotX) == null) return false;
        if (dots.get(dotX).contains(dotY)) return true;
        return false;
    }

    public boolean check(int x, int y, int dotX, int dotY, int r) {
        int xLen = (dotX - x) * (dotX - x);
        int yLen = (dotY - y) * (dotY - y);
        double len =  Math.sqrt(xLen + yLen);
        if (len > r) {
            return false;
        } else return true;
    }

    public static void main(String[] args) {
        int[][] a = new int[1][3];
        a[0] = new int[]{2, 2, 1};
        new Leetcode6042().countLatticePoints(a);
    }
}
