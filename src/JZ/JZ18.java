package JZ;

public class JZ18 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    public void Mirror(TreeNode root) {
        if(root ==null) return;
        if(root.left==null && root.right==null) return;
        TreeNode cur = root.left;
        root.left = root.right;
        root.right = cur;
        if(root.left!=null) Mirror(root.left);
        if(root.right!=null) Mirror(root.right);
        return;
    }
}
