package NC;

public class NC36 {
    public int findMedianinTwoSortedAray (int[] arr1, int[] arr2) {
        // write code here
        int l = 0,r = 0;
        int res = 0;
        while(l+r<arr1.length)
        {
            if(arr2[r]<arr1[l])
            {
                res = arr2[r++];
            }
            else
            {
                res = arr1[l++];
            }
        }
        return res;
    }
}
