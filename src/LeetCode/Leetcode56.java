package LeetCode;

import java.util.Arrays;
import java.util.Comparator;

public class Leetcode56 {
    public int [][] merge(int[][] intervals)
    {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        int res[][] = new int[intervals.length][2];
        int idx=-1;
        for(int [] interval: intervals)
        {
            if(idx ==-1 || interval[0]>res[idx][1])
            {
                res[++idx] = interval;
            }
            else
            {
                res[idx][1] = Math.max(res[idx][1],interval[1]);
            }
        }
        return Arrays.copyOf(res,idx+1);
    }
}
