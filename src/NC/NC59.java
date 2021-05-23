package NC;

public class NC59 {
    public int minPathSum (int[][] matrix) {
        // write code here
        int col = matrix.length;
        int row = matrix[0].length;
        int [][] dp = new int [col][row];
        dp[0][0] = matrix[0][0];
        for(int i =1;i<col;i++)
        {
            dp[i][0] = dp[i-1][0]+matrix[i][0];
        }
        for(int i =1;i<row;i++)
        {
            dp[0][i] = dp[0][i-1]+matrix[0][i];
        }
        for(int i =1;i<col;i++)
        {
            for(int j =1;j<row;j++)
            {
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1])+matrix[i][j];
            }
        }
        return dp[col-1][row-1];
    }
}
