package NC;

public class NC73 {
    public int MoreThanHalfNum_Solution(int [] array) {
        int count=0;
        int temp=0;
        for(int i=0;i<array.length;i++)
        {
            if(temp==array[i])count++;
            else if(count>0)count--;
            else
            {
                temp=array[i];
                count=1;
            }
        }
        count=0;
        for(int i=0;i<array.length;i++)
        {
            if(temp==array[i])
            {
                count++;
            }
        }
        return count>array.length/2?temp:0;
    }
}
