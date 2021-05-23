package LeetCode;

public class Leetcode283 {
    public void moveZeroes(int [] nums)
    {
        int i = 0,j=0;
        for(i = 0;i<nums.length;i++)
        {
            if(0 != nums[i])
            {
                nums[j]=nums[i];
                j++;
            }
        }
        while(j!=i)
        {
            nums[j]=0;
            j++;
        }
        return;
    }
}
