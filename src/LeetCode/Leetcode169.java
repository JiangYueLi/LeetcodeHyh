package LeetCode;

public class Leetcode169 {
    public int majorityElement(int[] nums) {
        int count  = 0;
        int major = nums[0];
        for(int num :nums)
        {
            if(count == 0)
            {
                major = num;
            }
            if(num == major)
            {
                count++;
            }
            else if(num != major)
            {
                count--;
            }
        }
        return major;
    }
}
