package LeetCode;

public class Leetcode213 {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0],nums[1]);

        int [] dpone = new int[nums.length];
        int [] dptwo = new int[nums.length];
        dpone[0] = nums[0];
        dpone[1] = Math.max(nums[0],nums[1]);
        for(int i = 2;i <nums.length-1;i++)
        {
            dpone[i] = Math.max(nums[i]+dpone[i-2],dpone[i-1]);
        }

        dptwo[1] = nums[1];
        dptwo[2] = Math.max(nums[1],nums[2]);
        for(int i =3 ;i<nums.length;i++)
        {
            dptwo[i] = Math.max(nums[i]+dptwo[i-2], dptwo[i-1]);
        }
        return Math.max(dpone[nums.length-2],dptwo[nums.length-1]);
    }
}
