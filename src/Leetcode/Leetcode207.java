package Leetcode;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Leetcode207 {

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean res = true;
        Map<Integer, List<Integer>> map = new ConcurrentHashMap<>();
        for (int i = 0; i < prerequisites.length; i++){
            if (map.get(prerequisites[i][0]) != null){
                map.get(prerequisites[i][0]).add(prerequisites[i][1]);
            } else {
                List<Integer> pool = new ArrayList<>();
                pool.add(prerequisites[i][1]);
                map.put(prerequisites[i][0], pool);
            }
        }
        int length = map.size();
        Iterator<Map.Entry<Integer, List<Integer>>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<Integer, List<Integer>> temp = iterator.next();
            if (temp.getValue() != null){
                res = res && dfs(map, 1, temp.getKey(), length);
            }
            if (res){
                map.remove(temp.getKey());
            }
        }
        return res;
    }

    public static boolean dfs(Map<Integer, List<Integer>> map, int round, int prev, int length){
        boolean res = true;
        if (round > length && map.get(prev) != null) return false;
        if (map.get(prev) != null) {
            for (Integer integer : map.get(prev)){
                res = res && dfs(map, round + 1, integer, length);
            }
            return res;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        int[][] a = new int[1][2];
        a[0][0] = 1;
        a[0][1] = 0;
//        a[1][0] = 0;
//        a[1][1] = 1;
        canFinish(2, a);
    }

}
