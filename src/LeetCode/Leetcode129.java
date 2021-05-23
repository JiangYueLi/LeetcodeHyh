package LeetCode;

public class Leetcode129 {
    public class TreeNode {
      int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
    }
     public int sum;
     public int sumNumbers(TreeNode root)
     {
         sum = 0;
         childsum(0,root);
         return sum;
     }
     public void childsum(int val,TreeNode root)
     {
         if(root == null) return;
         int k = val*10 +root.val;
         if (root.left == null && root.right==null)
         {
             sum +=k;
         }
         childsum(k,root.left);
         childsum(k,root.right);
     }

}
