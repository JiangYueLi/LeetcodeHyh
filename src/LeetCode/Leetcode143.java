package LeetCode;
public class Leetcode143 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val)
        {
            this.val = val;
        }
        ListNode(int val,ListNode next)
        {
            this.val =val;
            this.next = next;
        }
    }
    public void reorderList(ListNode head)
    {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next!=null)
        {
            fast=fast.next.next;
            slow = slow.next;
        }
        ListNode newHead = slow.next;
        slow.next = null;
        newHead = reverseList(newHead);
        while(newHead!=null)
        {
            ListNode temp=newHead.next;
            newHead.next = head.next;
            head.next = newHead;
            head = newHead.next;
            newHead = temp;
        }
    }

    private ListNode reverseList(ListNode head) {
        if (head == null)
        {
            return null;
        }
        ListNode tail = head;
        head = head.next;
        while(head!=null)
        {
            ListNode temp = head.next;
            head.next = tail;
            tail = head;
            head = temp;
        }
        return tail;
    }

}
