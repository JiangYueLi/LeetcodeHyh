package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode560 {
    public int subarraySum(int [] nums, int k)
    {
        Map<Integer,Integer> map = new HashMap<>();

        map.put(0,1);
        int sum = 0,ret = 0;
        for(int i = 0;i<nums.length;i++)
        {
            sum = sum+nums[i];
            if(map.containsKey(sum-k))
            ret = ret + map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ret;
    }
}
