import java.util.*;

public class Leetcode103 {
     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;

         TreeNode(int x) {
             val = x;
         }
     }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while (!queue.isEmpty())
        {
            int size = queue.size();
            LinkedList<Integer> item = new LinkedList<>();
            for(int i = 0;i<size;i++)
            {
                TreeNode node =queue.poll();
                if(node.left!=null)
                    queue.offer(node.left);
                if(node.right!=null)
                    queue.offer(node.right);
                if((level&1)==0)
                    item.add(node.val);
                else
                    item.push(node.val);
            }
            res.add(item);
            level++;
        }
        return res;
    }
}
