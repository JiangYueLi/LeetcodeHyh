package NC;

public class NC21 {
      public class ListNode {
    int val;
    ListNode next = null;

          public ListNode(int i) {
              this.val = i;
          }
      }
    public ListNode reverseBetween (ListNode head, int m, int n) {
        // write code here
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode p1 = newHead;
        for(int i =1;i<m && null!=p1;i++)
        {
            p1 = p1.next;
        }
        ListNode cur = p1.next;
        p1.next = null;
        ListNode tail=null;
        for(int i =1;i<=n-m+1 && null!=cur;i++)
        {
            ListNode tempNode = cur;
            cur = cur.next;
            tempNode.next = p1.next;
            p1.next = tempNode;
            if(null == tail)
            {
                tail= tempNode;
            }
        }
        tail.next = cur;
        return newHead.next;
    }
}
