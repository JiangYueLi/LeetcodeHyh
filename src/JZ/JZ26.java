package JZ;

public class JZ26 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
        public TreeNode Convert(TreeNode root) {
            if(root == null) return null;
            if(root.left == null && root.right==null) return root;
            TreeNode leftNode = Convert(root.left);
            TreeNode cur = leftNode;
            while(cur!=null && cur.right!=null)
            {
                cur=cur.right;
            }
            if(leftNode!=null)
            {
                root.left = cur;
                cur.right = root;
            }
            TreeNode rightNode = Convert(root.right);
            if(rightNode!=null)
            {
                root.right = rightNode;
                rightNode.left =root;
            }
            return leftNode==null?root:leftNode;
        }
}
