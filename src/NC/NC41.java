package NC;

import java.util.HashMap;

public class NC41 {
    public int maxLength (int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max =1;
        for(int start = 0,end = 0;end<arr.length;end++)
        {
            if(map.containsKey(arr[end]))
            {
                start = Math.max(start,map.get(arr[end]));
            }
            max = Math.max(max,end- start+1);
            map.put(arr[end],end);
        }
        return max;
    }
}
