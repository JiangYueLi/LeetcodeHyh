package NC;

public class NC127 {
    public String LCS (String str1, String str2) {
        // write code here
        int m = str1.length(),n=str2.length();
        int [][] dp = new int [m+1][n+1];
        int max = 0 ,index = 0;
        for(int i = 0 ;i<m;i++)
        {
            for(int j =0;j<n;j++)
            {
                if(str1.charAt(i) == str2.charAt(j))
                {
                    dp[i+1][j+1] = dp[i][j]+1;
                    if(max <dp[i+1][j+1])
                    {
                        max = dp[i+1][j+1];
                        index=j+1;
                    }
                }
            }
        }
        if(max == 0) return "-1";
        return str2.substring(index-max,index);
    }
}
