import java.util.HashMap;

public class EqualRowAndColumn {
    public int equalPairs(int[][] grid) {
        int result = 0;
        int row = 0;
        int index = 0;
        while(index < grid.length){
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < grid.length; i++) {
                map.put(i,grid[row][i]);
            }

            for (int i = 0; i < grid.length; i++) {
                int cur = 0;
                for (int j = 0; j < grid.length; j++) {
                    if(map.get(j)!=grid[j][i]){
                        cur=0;
                        break;
                    }else{
                        cur = 1;
                    }
                }
                result+=cur;
            }
            row++;
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {{3,1,2,2},{1,4,4,5},{2,4,2,2}};
        System.out.println(new EqualRowAndColumn().equalPairs(arr));
    }
}
