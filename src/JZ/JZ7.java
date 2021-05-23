package JZ;

public class JZ7 {
    public int Fibonacci(int n) {

        int pre = 0;
        int cur = 1;
        int temp = 0;

        if(n==0) return 0;
        if(n==1) return 1;
        for(int  i=2 ;i<=n;i++)
        {
            temp = pre+cur;
            pre = cur;
            cur = temp;
        }
        return temp;
    }
}
