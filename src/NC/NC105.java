package NC;

public class NC105 {
    public int upper_bound_ (int n, int v, int[] a)
    {
        int i = 0;
        int j = n-1;
        while(i<=j)
        {
            int mid = i +(j-i)/2;
            if(a[mid] < v)
            {
                i = mid+1;
            }
            else if(a[mid]>v)
            {
                j=mid-1;
            }
            else if(a[mid] == v)
            {
                j = mid-1;
            }

        }
        if(i>=n) return n+1;
        return i+1;
    }
}
