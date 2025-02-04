import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        int frshOrnge = 0;
        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    frshOrnge++;
                }
            }
        }

        if (frshOrnge == 0) return 0;

        int tme = 0;
        int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!q.isEmpty()) {
            int size = q.size();
            boolean markRott = false;

            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();
                int curri = curr[0];
                int currj = curr[1];

                for (int[] d : dir) {
                    int nwCuri = curri + d[0];
                    int nwCurj = currj + d[1];

                    if (nwCuri >= 0 && nwCuri < grid.length && nwCurj >= 0 && nwCurj < grid[0].length && grid[nwCuri][nwCurj] == 1) {
                        grid[nwCuri][nwCurj] = 2;
                        frshOrnge--;
                        markRott = true;
                        q.add(new int[]{nwCuri, nwCurj});
                    }
                }
            }

            if (markRott) tme++;
        }
        if ( frshOrnge == 0) return tme;
        return -1;
    }
}
