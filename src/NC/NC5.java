package NC;

public class NC5 {
      public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
  }
    public int sumNumbers (TreeNode root) {
        // write code here
        if(root==null) return 0;
        int sum=0;
        return preOrder(root,sum);
    }
    private int preOrder(TreeNode root,int sum)
    {
        if(root==null) return 0;
        sum = 10*sum + root.val;
        if(root.left==null && root.right==null) return sum;
        return preOrder(root.left,sum)+preOrder(root.right,sum);
    }
}
