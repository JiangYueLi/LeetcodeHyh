package LeetCode;

public class Leetcode121 {
    public int maxProfit(int[] prices)
    {
        int max = 0;
        int len = prices.length;
        if(prices.length<=1)
        {
            return max;
        }
        int left = prices[0];
        for(int i = 1;i<len;i++)
        {
            if(prices[i]>left)
            {
                max = Math.max(max,prices[i]-left);
            }
            else
            {
                left = prices[i];
            }
        }
        return max;
    }
}
