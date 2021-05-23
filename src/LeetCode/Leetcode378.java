package LeetCode;

public class Leetcode378 {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int min = matrix[0][0];
        int max = matrix[n-1][n-1];
        while(min < max)
        {
            int mid = min +(max-min)/2;
            if(check(matrix,mid,k,n))
            {
                max = mid;
            }
            else{
                min = mid+1;
            }
        }
        return min;
    }
    public boolean check(int [][] matrix,int mid,int k,int n)
    {
        int i = n-1;
        int j = 0;
        int num = 0;
        while(i>=0 && j<n)
        {
            if(matrix[i][j]<=mid)
            {
                num += i+1;
                j++;
            }
            else {
                i--;
            }
        }
        return num>=k;
    }
}
