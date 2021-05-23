package NC;

public class NC48 {
    public int search (int[] A, int target) {
        // write code here
        int left = 0, right = A.length-1;
        while(left<=right)
        {
            int mid = left + (right-left)/2;
            if(A[mid] == target)
                return mid;
            if(A[mid]>=A[left])
            {
                if(A[mid]>target && A[left]<=target)
                {
                    right = mid-1;
                }
                else
                {
                    left=mid+1;
                }
            }
            else{
                if(A[mid]<target && A[right]>=target)
                {
                    left=mid+1;
                }
                else
                {
                    right=mid-1;
                }
            }
        }
        return -1;
    }
}
