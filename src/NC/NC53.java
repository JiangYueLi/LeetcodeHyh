package NC;

public class NC53 {
    public class ListNode {
    int val;
    ListNode next = null;
  }
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        if(head == null) return null;
        ListNode p = head;
        ListNode q = head;
        ListNode pre = null;
        while(n>0)
        {
            if(p != null)
            {
                p = p.next;
            }
            else
            {
                return null;
            }
            n--;
        }
        if(p==null){
            return head.next;
        }
        while(p !=null)
        {
            p = p.next;
            pre = q;
            q = q.next;
            if(p == null)
            {
                pre.next = q.next;
            }
        }
        return head;
    }
}
