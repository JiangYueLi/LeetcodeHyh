package NC;

public class NC109 {
    public int solve (char[][] grid) {
        // write code here
        int islandNum = 0;
        for(int i = 0;i<grid.length;i++)
            for(int j =0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    gr(grid,i,j);
                    islandNum++;
                }
            }
        return islandNum;
    }
    public void gr(char[][] grid,int i ,int j)
    {
        if(i <0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j] != '1')
        {
            return;
        }
        grid[i][j] = '0';
        gr(grid,i,j+1);
        gr(grid,i,j-1);
        gr(grid,i+1,j);
        gr(grid,i-1,j);
    }

}
