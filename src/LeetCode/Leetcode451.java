package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Leetcode451 {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((o1,o2)->map.get(o2)-map.get(o1));
        maxHeap.addAll(map.keySet());
        StringBuffer res= new StringBuffer();
        while(!maxHeap.isEmpty())
        {
            char key = maxHeap.poll();
            int val = map.get(key);
            for(int i =0;i<val;i++)
            {
                res.append(key);
            }

        }
        return res.toString();
    }
}
