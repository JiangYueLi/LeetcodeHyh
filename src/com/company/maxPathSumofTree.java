package com.company;

import javax.swing.tree.TreeNode;

public class maxPathSumofTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
    private int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root)
    {
        getMax(root);
        return res;
    }

    private int getMax(TreeNode r) {
        {
            if(r == null) return 0;
            int left = Math.max(0,getMax(r.left));
            int right = Math.max(0,getMax(r.right));
            res = Math.max(res, r.val+left+right);
            return Math.max(left,right)+r.val;
        }
    }
}
