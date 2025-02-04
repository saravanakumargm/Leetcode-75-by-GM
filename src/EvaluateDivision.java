import java.util.HashMap;
import java.util.List;

public class EvaluateDivision {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        int equationSize = equations.size();
        UnionFind unionFind = new UnionFind(2 * equationSize);
        HashMap<String, Integer> map = new HashMap<>(2 * equationSize);
        int index = 0;
        for (int i = 0; i < equationSize; i++) {
            List<String> equation = equations.get(i);
            String var1 = equation.get(0);
            String var2 = equation.get(1);
            if (!map.containsKey(var1)) {
                map.put(var1, index++);
            }
            if (!map.containsKey(var2)) {
                map.put(var2, index++);
            }
            unionFind.union(map.get(var1), map.get(var2), values[i]);
        }

        int queriesSize = queries.size();
        double[] res = new double[queriesSize];
        for (int i = 0; i < queriesSize; i++) {
            List<String> query = queries.get(i);
            String var1 = query.get(0);
            String var2 = query.get(1);
            Integer val1 = map.get(var1);
            Integer val2 = map.get(var2);
            if (val1 == null || val2 == null) {
                res[i] = -1.0;
            } else {
                res[i] = unionFind.isConnected(val1, val2);
            }
        }

        return res;
    }

    private class UnionFind {
        private int[] parent;
        private double[] weight;

        public UnionFind(int size) {
            parent = new int[size];
            weight = new double[size];
            for (int i = 0; i < size; i++) {
                parent[i] = i;
                weight[i] = 1.0;
            }
        }

        public void union(int a, int b, double value) {
            int rootA = find(a);
            int rootB = find(b);
            if (rootA == rootB) {
                return;
            }
            parent[rootA] = rootB;
            weight[rootA] = weight[b] * value / weight[a];
        }

        public int find(int a) {
            if (parent[a] != a) {
                int origin = parent[a];
                parent[a] = find(parent[a]);
                weight[a] *= weight[origin];
            }
            return parent[a];
        }

        public double isConnected(int a, int b) {
            int rootA = find(a);
            int rootB = find(b);
            if (rootA == rootB) {
                return weight[a] / weight[b];
            } else {
                return -1.0;
            }
        }
    }
}
