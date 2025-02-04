import java.util.LinkedList;
import java.util.Queue;

public class NumberOfProvinces {
    private void bfs(int[][] isConnected, int node, boolean[] vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            int current = q.poll();
            for(int i =0;i<isConnected.length;i++){
                if(isConnected[current][i]==1 && !vis[i]){
                    vis[i] = true;
                    q.add(i);
                }
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int graphSize = isConnected.length;
        boolean[] visited = new boolean[graphSize];
        int count = 0;
        for(int i=0;i<graphSize;i++){
            if(!visited[i]){
                count++;
                bfs(isConnected,i,visited);
            }
        }
        return count;
    }
}
