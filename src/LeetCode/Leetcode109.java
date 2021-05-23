package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode109 {
      public class ListNode {
      int val;
      ListNode next;
 ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }



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
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        List<ListNode> list = new ArrayList<>();
        while(head!=null)
        {
            list.add(head);
            head = head.next;
        }
        int len = list.size();
        return reConstruct(list,0,len-1);
    }
    public TreeNode reConstruct(List<ListNode> list,int left,int right)
    {
        if(left>right) return null;
        int m = left+(right-left)/2;
        TreeNode root = new TreeNode(list.get(m).val);
        root.left = reConstruct(list,left,m-1);
        root.right = reConstruct(list,m+1,right);
        return root;
    }
}
