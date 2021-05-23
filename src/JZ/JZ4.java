package JZ;

public class JZ4 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x) {
            this.val = x;
        }
    }
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root = reConstruct(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }
    public TreeNode reConstruct(int [] pre,int startpre,int endpre,int []in,int startin,int endin)
    {
        if(startin>endin || startpre>endpre) return null;
        TreeNode treeNode = new TreeNode(pre[startpre]);
        for(int i = startin;i<=endin;i++)
        {
            if(pre[startpre] == in[i])
            {
                treeNode.left = reConstruct(pre,startpre+1,startpre+i-startin,in,startin,i-1);
                treeNode.right = reConstruct(pre,startpre+i-startin+1,endpre,in,i+1,endin);
            }
        }
        return treeNode;
    }
}
