import java.util.ArrayDeque;
import java.util.Queue;

public class NearestExitFromEntranceInMaze {
    public int nearestExit(char[][] maze, int[] entrance) {
        int minMove = 0;
        int r = maze.length;
        int c = maze[0].length;
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(entrance);
        maze[entrance[0]] [entrance[1]] = '#';
        int[][] directions = new int[][]{{-1,0}, {0,1}, {1,0}, {0,-1}};
        while(!q.isEmpty()){
            minMove++;
            int len = q.size();
            for(int i=0; i<len; i++){
                int[] dir = q.poll();
                for(int[] distance : directions){
                    int row = distance[0] + dir[0];
                    int col = distance[1] + dir[1];
                    if(row<r && row>=0 && col>=0 && col<c && maze[row][col]=='.'){
                        if(row==0 || row==r-1 || col==0 || col==c-1){
                            return minMove++;
                        }
                        q.offer(new int[]{row,col});
                        maze[row][col] = '#';
                    }
                }
            }
        }
        return -1;
    }
}
