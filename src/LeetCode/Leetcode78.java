package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(new ArrayList<Integer>());
        for(int i = 0;i<nums.length;i++)
        {
            int size = res.size();
            for(int j =0;j<size;j++)
            {
                List<Integer> tmp = new ArrayList<Integer>(res.get(j));
                tmp.add(nums[i]);
                res.add(tmp);
            }
        }
        return res;
    }

}
