package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leetcode1207 {
    public boolean uniqueOccurrences(int[] arr)
    {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0;i<arr.length;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],1);
            }
            else
            {
                map.replace(arr[i],map.get(arr[i])+1);
            }
        }
        Set<Integer> set = new HashSet<Integer>();
        for(int i :map.values())
        {
            if(set.contains(i))
            {
                return false;
            }
            set.add(i);
        }
        return true;
    }
}
