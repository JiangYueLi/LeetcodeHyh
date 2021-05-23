package LeetCode;

import java.util.*;

public class Leetcode381 {
    class RandomizedCollection{
        private List<Integer> vals;
        private Map<Integer, Set<Integer>> indexs;
        private int index;

        /** Initialize your data structure here. */
        public RandomizedCollection() {
            vals = new ArrayList<>();
            indexs = new HashMap<>();
            index = 0;
        }

        /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
        public boolean insert(int val) {
            vals.add(val);
            if(!indexs.containsKey(val))
            {
                indexs.put(val,new HashSet<>());
            }
            indexs.get(val).add(index ++);
            return indexs.get(val).size() == 1;
        }

        /** Removes a value from the collection. Returns true if the collection contained the specified element. */
        public boolean remove(int val) {
            if(!indexs.containsKey(val) || indexs.get(val).size()==0) return false;
            Set<Integer> is = indexs.get(val);
            int randomIndex = is.iterator().next();
            is.remove(randomIndex);
            int last = vals.get(index-1);
            vals.set(randomIndex,last);
            if (randomIndex!=index-1)
            {
                Set<Integer> set = indexs.get(last);
                set.remove(index -1);
                set.add(randomIndex);
            }
            vals.remove(--index);
            return true;
        }

        /** Get a random element from the collection. */
        public int getRandom() {
            if(index <=0) throw new RuntimeException("kong");
            int i  = (int)Math.floor(Math.random()*index);
            return vals.get(i);
        }
    }
}
