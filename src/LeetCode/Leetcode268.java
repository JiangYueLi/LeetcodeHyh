package LeetCode;

public class Leetcode268 {
    public int missingNumber(int[] nums) {
        int res = nums.length;
        for(int i =0;i<nums.length;++i)
        {
            res ^=nums[i];
            res ^=i;
        }
        return res;
    }
}
