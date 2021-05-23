package JZ;

public class JZ14 {
    public class ListNode{
        int val;
        ListNode next = null;
        ListNode(int val)
        {
            this.val=val;
        }
    }
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        int count = 0;
        int m =k;
        while (k!=0 && fast!=null)
        {
            fast = fast.next;
            count++;
            k--;
        }
        if(count<m) return null;

        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}
