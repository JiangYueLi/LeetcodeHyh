package LeetCode;

public class Leetcode136 {
    public int SingleNumber(int[] nums)
    {
        int a = 0;
        for(int num :nums)
        {
            a = a^num;
        }
        return a;
    }
}
