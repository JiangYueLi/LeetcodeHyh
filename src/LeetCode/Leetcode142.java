package LeetCode;

public class Leetcode142 {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
      public ListNode detectCycle(ListNode head)
      {
          if(head == null) return head;
          ListNode fast = head;
          ListNode slow = head;
          while (fast.next !=null && fast.next.next != null)
          {
              fast = fast.next.next;
              slow = slow.next;
              if(fast == slow)
              {
                  fast = head;
                  while(fast != slow)
                  {
                      fast = fast.next;
                      slow = slow.next;
                  }
                  return fast;
              }
          }
          return null;
      }
    }
}
