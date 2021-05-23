package NC;

public class NC17 {
    public int getLongestPalindrome(String A, int n) {
        // write code here
        if(A==null || n ==0) return 0;
        int []range = new int [2];
        char[]str = A.toCharArray();
        for(int i =0;i<A.length();i++)
        {
            i = findLongest(str,i,range);
        }
        return range[1]-range[0]+1;
    }
    public int findLongest(char[] str , int low, int [] range)
    {
        int high = low;
        while(high < str.length - 1 && str[high] == str[high + 1])
        {
            high++;
        }
        int ans = high;
        while (low > 0 && high < str.length -1 && str[low-1] == str[high +1])
        {
            low--;
            high++;
        }
        if(high-low > range[1] - range[0])
        {
            range[1] = high;
            range[0] = low;
        }
        return ans;
    }
}
