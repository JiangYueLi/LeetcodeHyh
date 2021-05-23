package NC;

public class NC19 {
    public int maxsumofSubarray (int[] arr) {
        // write code here
        int length = arr.length;
        int dp[] = new int[length+1];
        dp[0] = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i =1;i<length+1;i++)
        {
            dp[i] = Math.max(arr[i-1],dp[i-1]+arr[i-1]);
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}
