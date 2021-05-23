package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> res = new HashSet<>();
        for(int i :nums)
        {
            if(false ==res.add(i))
                return true;
        }
        return false;
    }
}
