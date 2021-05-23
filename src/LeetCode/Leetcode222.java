package LeetCode;


public class Leetcode222 {
      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public int countNodes(TreeNode root) {
          if(root==null) return 0;
          int ld = getDepth(root.left);
          int rd = getDepth(root.right);
          if(ld == rd) return (1<<ld) + countNodes(root.right);
          else return (1<<rd) + countNodes(root.left);
    }
    private int getDepth(TreeNode r)
    {
        int depth = 0;
        while(r !=null)
        {
            depth++;
            r = r .left;
        }
        return depth;
    }
}
