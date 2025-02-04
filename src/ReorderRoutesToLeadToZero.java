import java.util.ArrayList;
import java.util.List;

public class ReorderRoutesToLeadToZero {
    private int count = 0;

    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> adj = new ArrayList<>(n);
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<Integer>());
        }
        for (int[] edge : connections) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(-edge[0]);
        }

        DFS(adj, visited, 0);

        return count;
    }

    public void DFS(List<List<Integer>> adj, boolean[] visited, int index) {
        visited[index] = true;
        for (int i : adj.get(index)) {
            if (!visited[Math.abs(i)]) {
                if (i > 0) {
                    count++;
                }
                DFS(adj, visited, Math.abs(i));
            }
        }

    }
}
