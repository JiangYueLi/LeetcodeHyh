package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Leetcode39 {
    List<List<Integer>> res= new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> path = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(path,candidates,target,0,0);
        return res;
    }
    public void backtrack(List<Integer> path,int[] candidates,int target,int sum,int begin){
        if(sum == target)
        {
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = begin;i<candidates.length;i++)
        {
            int rs = candidates[i]+sum;
            if(rs<=target)
            {
                path.add(candidates[i]);
                backtrack(path,candidates,target,rs,i);
                path.remove(path.size()-1);
            }
            else{
                break;
            }
        }
    }
}
