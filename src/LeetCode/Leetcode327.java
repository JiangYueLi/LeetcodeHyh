package LeetCode;

public class Leetcode327 {
        public int countRangeSum(int[] nums, int lower, int upper) {
            int length = nums.length;
            if(nums==null || length==0) return 0;
            int res = 0;

            for(int i =0;i<length;i++)
            {
                long count = nums[i];
                if(true == isbetweenlowerandupper(lower,upper,count))
                {
                    res++;
                }
                for(int j = i+1;j<length;j++)
                {
                    count += nums[j];
                    if(true == isbetweenlowerandupper(lower,upper,count))
                    {
                        res++;
                    }
                }
            }
            return res;
        }
    public boolean isbetweenlowerandupper(int lower,int upper,long num)
    {
        if(num>=lower && num<= upper)
        {
            return true;
        }
        return false;
    }
}
