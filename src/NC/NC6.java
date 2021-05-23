package NC;

public class NC6 {
    public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
  }
    private int res = Integer.MIN_VALUE;
    public int maxPathSum (TreeNode root) {
        // write code here
        getMax(root);
        return res;
    }
    private int getMax(TreeNode root)
    {
        if(root==null) return 0;
        int left= Math.max(0,getMax(root.left));
        int right = Math.max(0,getMax(root.right));
        res =Math.max(res,root.val+left+right);
        return Math.max(left,right)+root.val;
    }
}
