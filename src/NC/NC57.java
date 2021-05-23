package NC;

public class NC57 {
    public int reverse (int x) {
        // write code hereint res=0;
        int res = 0;
        while(x!=0){
            //最后一位
            int tail=x%10;
            int newRes=res*10+tail;
            //如果newRes-tail)/10!=res说明产生了溢出
            if((newRes-tail)/10!=res)
                return 0;
            res=newRes;
            x=x/10;
        }
        return res;
    }
}
