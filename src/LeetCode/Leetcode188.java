package LeetCode;

public class Leetcode188 {
    public int maxProfit(int k,int[] prices)
    {
        if(prices == null || prices.length<2 || k==0) return 0;
        if(k>=prices.length/2) return greedy(prices);
        int [][][]dp = new int[prices.length][k+1][2];
        for(int i = 0;i<prices.length;i++)
        {
            for(int j=1;j<=k;j++)
            {
                if(i==0)
                {
                    dp[i][j][0] =0;
                    dp[i][j][1] = -prices[0];
                }
                else
                {
                    dp[i][j][0] = Math.max(dp[i-1][j][0],dp[i-1][j][1]+prices[i]);
                    dp[i][j][1] = Math.max(dp[i-1][j][1],dp[i-1][j-1][0]-prices[i]);
                }
            }
        }
        int max =Integer.MIN_VALUE;
        for(int i=1;i<k+1;i++)
        {
            max = Math.max(max,dp[prices.length-1][i][0]);
        }
        return max;
    }
    public int greedy(int [] p)
    {
        int max = 0;
        for(int i =1;i<p.length;i++)
        {
            if(p[i]>p[i-1]){
                max +=p[i]-p[i-1];
            }
        }
        return max;
    }
}
