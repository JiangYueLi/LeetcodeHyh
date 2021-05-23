package LeetCode;

import java.util.HashSet;

public class leetcode128 {
    public int longestConsecutive(int [] nums)
    {
        int max = 0;
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for(int num :nums)
        {
            hashSet.add(num);
        }
        for (int num : hashSet)
        {
            if(!hashSet.contains(num-1))
            {
                int curNum = num;
                int curStrak = 1;
                while(hashSet.contains(++curNum)) {
                    curStrak++;
                }
                max = Math.max(curStrak,max);
            }
        }
        return max;
    }
}
