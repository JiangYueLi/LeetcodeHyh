package LeetCode;

public class Leetcode461 {
    public int hammingDistance(int x,int y )
    {
        if (x == y) return 0;
        int z = x ^ y;
        int count = 0;
        while(z != 0)
        {
            if(z % 2 != 0)
            {
                count++;
            }
            z = z / 2;

        }
        return count;
    }
}
