package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode34 {
    public class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x)
        {
            val = x;
        }
    }
    private List<List<Integer>> res;
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        res = new ArrayList<>();
        backtrack(root,sum,new ArrayList<Integer>());
        return res;
    }
    private void backtrack(TreeNode root,int target,List<Integer> collector)
    {
       if(root == null)
       {
           return;
       }
       collector.add(root.val);
       target -=root.val;
       if(target==0 && root.left==null &&root.right==null)
       {
           res.add(new ArrayList<Integer>(collector));
       }
       else
       {
           backtrack(root.left,target,collector);
           backtrack(root.right,target,collector);
       }
       collector.remove(collector.size()-1);
    }
}
