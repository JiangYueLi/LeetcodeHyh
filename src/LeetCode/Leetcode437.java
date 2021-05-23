package LeetCode;

public class Leetcode437 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){};
        TreeNode(int val)
        {
            this.val =val;
        }
        TreeNode(TreeNode left,TreeNode right)
        {
            this.left = left;
            this.right = right;
        }
    }
    public  int count = 0;
    public int pathSum(TreeNode root,int sum)
    {
        if(root == null) return count;
        addval(root,sum,0);
        pathSum(root.left,sum);
        pathSum(root.right,sum);
        return count;
    }
    public void addval(TreeNode root,int sum,int num)
    {
        if(root == null) return;
        num = num+root.val;
        if(num == sum)
        {
            count++;
        }
        addval(root.left,sum,num);
        addval(root.right,sum,num);
    }
}
