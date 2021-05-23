package NC;

import java.util.ArrayList;
import java.util.Arrays;

public class NC54 {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> t;
        int len =num.length;
        for(int i =0;i<len-2;i++)
        {
            if(i==0 || num[i]!=num[i-1])
            {
                int left = i+1;
                int right=len-1;
                while(left<right)
                {
                    while (left < right && (num[i] + num[left] + num[right]) > 0) {
                        right--;
                    }
                    if (left < right && (num[i] + num[left] + num[right]) == 0) {
                        t = new ArrayList<>();
                        t.add(num[i]);
                        t.add(num[left]);
                        t.add(num[right]);
                        res.add(t);
                        while (left < right && num[left] == t.get(1)) {
                            left++;
                        }
                    } else {
                        left++;
                    }
                }
            }
        }
        return res;
    }
}
