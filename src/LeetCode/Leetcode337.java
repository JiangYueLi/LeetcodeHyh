package LeetCode;

public class Leetcode337 {
    public class TreeNode {
      int val;
     TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public int rob(TreeNode root) {
        int []res = helper(root);
        return Math.max(res[0],res[1]);
    }

    public int [] helper(TreeNode root)
    {
        if(root == null) return new int [2];
        int [] left  = helper(root.left);
        int [] righr = helper(root.right);
        int [] res = new int [2];
        res[0] = Math.max(left[0],left[1])+Math.max(righr[0],righr[1]);
        res[1] = root.val + left[0]+righr[0];
        return res;
    }
}
