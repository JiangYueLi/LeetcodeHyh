package NC;

public class NC4 {
     class ListNode {
     int val;
     ListNode next;
      ListNode(int x) {
          val = x;
         next = null;
     }
 }
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;

        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                return true;
            }
        }
        return  false;
    }
}
