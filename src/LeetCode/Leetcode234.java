package LeetCode;

public class Leetcode234 {
        public class ListNode
        {
            int val;
            ListNode next;
            ListNode(int x) { val = x; }
        }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
        {
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reverse(slow.next);
        while(slow !=null)
        {
            if(head.val !=slow.val)
            {
                return false;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head)
    {
        if(head.next == null)
        {
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
