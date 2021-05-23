package NC;

public class NC92 {
    public String LCS (String s1, String s2) {
        // write code here
        if(s1 == null || s2 == null || s1.length() == 0 || s2.length() == 0) return "-1";
        int l1 = s1.length(), l2 = s2.length();
        int[][] dp = new int[l1+1][l2+1];
        int maxLen = 0;
        int maxEnd = 0;
        for(int i=1;i<=l1;i++) {
            for(int j=1;j<=l2;j++) {
                if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int i= l1, j=l2;
        while(i>0 && j>0) {
            if(s1.charAt(i-1) == s2.charAt(j-1)) {
                sb.append(s1.charAt(i-1));
                i--;
                j--;
            } else {
                if(dp[i][j-1] > dp[i-1][j]) {
                    j--;
                } else {
                    i--;
                }
            }
        }

        return sb.length() == 0 ? "-1" : sb.reverse().toString();
    }
}
