package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode349 {
    public int [] intersection(int [] nums1,int []nums2)
    {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for(int num: nums1)
        {
            set1.add(num);
        }
        for(int num : nums2)
        {
            if(set1.contains(num))
            {
                set2.add(num);
            }
        }
        int [] result = new int[set2.size()];
        int start = 0;
        for(int set :set2)
        {
            result[start] = set;
            start++;
        }
        return result;
    }
}
