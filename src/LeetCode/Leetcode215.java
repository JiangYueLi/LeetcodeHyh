package LeetCode;

import java.util.PriorityQueue;

public class Leetcode215 {
    public int findKthLargest(int []nums,int k )
    {
        PriorityQueue<Integer> head = new PriorityQueue<>();
        for(int num :nums)
        {
            head.add(num);
            if(head.size()>k)
            {
                head.poll();
            }
        }
        return head.peek();
    }
}
