package JZ;

public class JZ9 {
    public int JumpFloorII(int target) {

        if(target==0) return 0;
        if(target==1) return 1;
        if(target==2) return 2;
        int dp[] = new int [target+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for(int i =3;i<=target;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                dp[i] +=dp[i-j];
            }
        }
        return dp[target];
    }
}
