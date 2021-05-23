package LeetCode;

import java.util.Stack;

public class Leetcode230 {
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
    public int kthSmallest(TreeNode root, int k) {
        Stack<Integer> stack = new Stack<>();
        helper(root,stack,k);
        return stack.peek();
    }
    public void helper(TreeNode root,Stack<Integer> stack,int k)
    {
        if(root == null)
            return;
        helper(root.left,stack,k);
        if(stack.size()==k)
        {
            return;
        }
        stack.push(root.val);
        helper(root.right,stack,k);
    }
}
