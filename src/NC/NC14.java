package NC;

import java.util.*;

public class NC14 {
    public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
  }
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder (TreeNode root) {
        // write code here

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        int size = 0;
        int k = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int sise = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0;i<sise;i++)
            {
                TreeNode cur = queue.poll();
                list.add(cur.val);
                if(cur.left!= null)
                {
                    queue.offer(cur.left);
                }
                if(cur.right!=null)
                {
                    queue.offer(cur.right);
                }
            }
            if(k %2 ==1)
            {
                Collections.reverse(list);
            }
            k++;
            res.add(list);
        }
        return res;
    }
}
