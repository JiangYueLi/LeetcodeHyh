package LeetCode;

public class leetcode123 {
    public int maxProfit(int []prices)
    {
        if(prices == null || prices.length<=1 )return 0;
        int [][][]dp = new int [prices.length][2][3];
        dp[0][0][0] = 0;
        dp[0][0][1] = 0;
        dp[0][0][2] = 0;
        dp[0][1][0] = -prices[0];
        dp[0][1][1] = -prices[0];
        dp[0][1][2] = -prices[0];
        for(int i=1;i<prices.length;i++)
        {
            dp[i][0][0] = 0;
            dp[i][0][1] = Math.max(dp[i-1][1][0]+prices[i],dp[i-1][0][1]);
            dp[i][0][2] = Math.max(dp[i-1][1][1]+prices[i],dp[i-1][0][2]);
            dp[i][1][0] = Math.max(dp[i-1][0][0]-prices[i],dp[i-1][1][0]);
            dp[i][1][1] = Math.max(dp[i-1][0][1]-prices[i],dp[i-1][1][1]);
            dp[i][1][2] = 0;
        }
        return Math.max(dp[prices.length-1][0][2],dp[prices.length-1][0][1]);
    }
}
