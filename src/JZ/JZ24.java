package JZ;

import java.util.ArrayList;

public class JZ24 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    private ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    private ArrayList<Integer> path= new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {

        if(root == null) return res;
        path = find(root,target,0);
        return res;
    }
    public ArrayList<Integer> find(TreeNode root,int target,int sum)
    {
        if(root==null) return path;
        sum +=root.val;
        path.add(root.val);
        if(root.left==null && root.right==null && sum == target)
        {
            res.add(new ArrayList<>(path));
        }
        find(root.left,target,sum);
        find(root.right,target,sum);
        path.remove(path.size()-1);
        return path;
    }
    }
}
