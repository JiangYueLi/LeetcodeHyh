package NC;

public class NC32 {
    public int sqrt (int x) {
        if(x<=0) return 0;
        int i =1;
        for( i =1;i<=x;i++)
        {
            if((i*i <= x) && ((i+1)*(i+1) > x))
            {
                break;
            }
        }
        return i;
    }
}
