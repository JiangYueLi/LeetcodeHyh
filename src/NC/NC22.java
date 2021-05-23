package NC;

public class NC22 {
    public void merge(int A[], int m, int B[], int n) {
        int right = A.length-1;
        int curA = m-1;
        int curB = n-1;
        while (curA>=0 && curB>=0)
        {
            if(A[curA]>=B[curB])
            {
                A[right--] = A[curA--];
            }
            else {
                A[right--] = B[curB--];
            }
        }
        while(curA >= 0) {
            A[right--] = A[curA--];
        }

        while(curB >= 0) {
            A[right--] = B[curB--];
        }
    }
}
