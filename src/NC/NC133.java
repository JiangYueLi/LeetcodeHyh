package NC;

public class NC133 {
      public class ListNode {
    int val;
    ListNode next = null;
  }
    public ListNode oddEvenList (ListNode head) {
        // write code hereif(head == null || head.next == null) return head;
        ListNode evenHead = head.next;
        ListNode odd = head,even = head.next;
        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
