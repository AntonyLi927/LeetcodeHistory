package Leetcode;


import java.util.HashMap;
import java.util.List;

public class Leetcode399 {

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        int size = equations.size();
        UnionFind unionFind = new UnionFind(size * 2);
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < size; i++) {
            List<String> equation = equations.get(i);
            String a = equation.get(0);
            String b = equation.get(1);
            if (map.get(a) == null) {
                map.put(a, count);
                count++;
            }

            if (map.get(b) == null) {
                map.put(b, count);
                count++;
            }

            unionFind.union(map.get(a), map.get(b), values[i]);
        }



        double[] res = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            List<String> query = queries.get(i);
            String a = query.get(0);
            String b = query.get(1);

            Integer ai = map.get(a);
            Integer bi = map.get(b);
            if (ai == null || bi == null) {
                res[i] = -1.0D;
            } else {
                res[i] = unionFind.isConnected(ai, bi);
            }
        }

        return res;

    }



    public static class UnionFind {
        int[] parents;
        double[] weight;

        public UnionFind(int length) {
            parents = new int[length];
            weight = new double[length];
            for (int i = 0; i < length; i++) {
                parents[i] = i;
                weight[i] = 1.0D;
            }
        }

        public int find(int x) {

            if (x != parents[x]) {
                int origin = parents[x];
                parents[x] = find(parents[x]);
                weight[x] *= weight[origin];
            }
            return parents[x];
        }

        public void union(int x, int y, double value) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) return;

            parents[rootX] = rootY;
            weight[rootX] = weight[y] * value / weight[x];
        }


        public double isConnected(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) {
                return weight[x] / weight[y];
            } else {
                return -1.0d;
            }
        }

    }



}
