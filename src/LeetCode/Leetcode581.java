package LeetCode;

public class Leetcode581 {
    public int findUnsortedSubarray(int []nums)
    {
        int len = nums.length;
        if(len <= 1) return 0;
        int high = 0, low = len-1;
        int max = nums[high], min = nums[low];
        for(int i = 0;i<len;i++)
        {
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[len-1-i]);
            if(nums[i]<max) high = i;
            if(nums[len-1-i]>min) low = len-1-i;

        }
        return high>low?high-low+1:0;
    }
}
