package LeetCode;

import java.util.*;

public class Leetcode347 {
    public int[] topKFrequent(int[] nums, int k) {
        int [] result = new int [k];
        HashMap<Integer,Integer> hashMap= new HashMap<Integer,Integer>();
        for(int num :nums)
        {
            if(hashMap.containsKey(num))
            {
                hashMap.put(num,hashMap.get(num) +1);
            }
            else
            {
                hashMap.put(num,1);
            }
        }
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int tmp = hashMap.get(o2) - hashMap.get(o1);
                return tmp;
            }
        });
        for(int num : hashMap.keySet())
        {
            heap.add(num);
        }
        if(k > heap.size())
        {
            return null;
        }
        for(int i = 0;i<k;i++)
        {
            result[i] = heap.poll();
        }
        return result;
    }
}
