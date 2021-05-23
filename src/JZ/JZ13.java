package JZ;

import java.util.ArrayList;
import java.util.List;

public class JZ13 {
    public class Solution {
        public void reOrderArray(int [] array) {
            List<Integer> list1 = new ArrayList<>();
            List<Integer>  list2 = new ArrayList<>();
            for(int num :array)
            {
                if(num%2==1)
                {
                    list1.add(num);
                }
                else
                {
                    list2.add(num);
                }
            }
            for(int num:list2)
            {
                list1.add(num);
            }
            for(int i =0;i<array.length;i++)
            {
                array[i] = list1.get(i);
            }
        }
    }
}
