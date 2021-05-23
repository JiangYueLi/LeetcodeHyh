package LeetCode;

public class Leetcode328 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode o = head;
        ListNode p = head.next;
        ListNode e = p;
        while(o.next!=null && e.next!=null)
        {
            o.next = e.next;
            o = o.next;
            e.next = o.next;
            e = e.next;
        }
        o.next = p;
        return head;
    }
}
