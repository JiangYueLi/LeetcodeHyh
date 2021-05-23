package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer,Integer> hashmap = new HashMap<>();
        for(int a :A)
        {
            for(int b:B)
            {
                hashmap.put(a+b,hashmap.getOrDefault(a+b,0)+1);
            }
        }
        int sum = 0;
        for(int c:C)
        {
            for(int d:D)
            {
                if(hashmap.containsKey(0-c-d))
                {
                    sum += hashmap.get(0-c-d);
                }
            }
        }
        return sum;
    }
}
