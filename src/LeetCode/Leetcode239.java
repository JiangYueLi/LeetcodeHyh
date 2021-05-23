package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leetcode239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        class MonotonicQueue{
            LinkedList<Integer> q = new LinkedList<>();
            public void push(int n)
            {
                while(!q.isEmpty()&&q.getLast()<n)
                {
                    q.pollLast();
                }
                q.add(n);
            }
            public int  getmax(){
                return q.getFirst();
            }
            public void pop(int n)
            {
                if(n==q.getFirst())
                {
                    q.pollFirst();
                }
            }
        }
        MonotonicQueue window = new MonotonicQueue();
        List<Integer> res =new ArrayList<>();
        for(int i =0;i< nums.length;i++)
        {
            if(i<k-1)
            {
                window.push(nums[i]);
            }
            else
            {
                window.push(nums[i]);
                res.add(window.getmax());
                window.pop(nums[i-k+1]);
            }
        }
        int []arr = new int [res.size()];
        for(int i =0 ;i<res.size();i++)
        {
            arr[i] = res.get(i);
        }
        return arr;
    }
}
