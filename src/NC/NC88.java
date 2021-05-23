package NC;

public class NC88 {
    public int findKth(int[] a, int n, int K) {
        // write code here

        return findK(a,0,n-1,K);
    }
    public int  findK(int []arr,int left,int right,int k){
        if(left<=right)
        {
            int pivot = partition(arr,left,right);
            if (pivot == k - 1) {
                return arr[pivot];
            } else if (pivot < k - 1) {
                return findK(arr, pivot + 1, right, k);
            } else {
                return findK(arr, left, pivot - 1, k);
            }
        }
        return -1;
    }

    public int partition(int []arr,int left,int right)
    {
        int temp = arr[left];
        while(left<right)
        {
            while(left<right&&arr[right]<=temp)
            {
                right--;
            }
            arr[left] = arr[right];
            while(left<right&&arr[left]>=temp)
            {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] =temp;
        return left;
    }
}
