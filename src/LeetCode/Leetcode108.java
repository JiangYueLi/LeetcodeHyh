package LeetCode;

public class Leetcode108 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null) return null;
        return newroot(nums,0,nums.length-1);
    }
    public TreeNode newroot(int [] nums,int left,int right)
    {
        if(left>right) return null;
        int m = left+(right-left)/2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = newroot(nums,left,m-1);
        root.right = newroot(nums,m+1,right);
        return root;
    }
}
