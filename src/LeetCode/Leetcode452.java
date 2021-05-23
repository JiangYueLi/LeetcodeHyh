package LeetCode;

import java.util.Arrays;

public class Leetcode452 {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;
        if (points.length == 1) return 1;
        Arrays.sort(points,(a,b)->(a[1]-b[1]));
        int count = 1;
        int end = points[0][1];
        for (int[] interval : points) {
            if (interval[0] > end) {
                count++;
                end = interval[1];
            }
        }
        return count;
    }
}
