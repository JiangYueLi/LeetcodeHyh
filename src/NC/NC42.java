package NC;

import java.util.ArrayList;
import java.util.Arrays;

public class NC42 {
    ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        Arrays.sort(num);
        helper(list,num,new boolean[num.length]);
        return res;
    }
    public void helper(ArrayList<Integer> list,int []nums,boolean []used){
        if(list.size()==nums.length){
            res.add(new ArrayList<Integer>(list));
            return;
        }

        for(int i=0;i<nums.length;i++ ){
            if(used[i]==true) continue;
            if(i>0 &&nums[i-1]==nums[i] && !used[i-1]) continue;//只能按一个顺序进行访问连续相同的元素，才能保证唯一
            used[i]=true;
            list.add(nums[i]);
            helper(list,nums,used);
            list.remove(list.size()-1);
            used[i]=false;

        }
    }

}
