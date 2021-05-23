package LeetCode;

public class Leetcode148 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode (){};
        ListNode (int val)
        {
            this.val =val;
        }
        ListNode(int val,ListNode next)
        {
            this.val=val;
            this.next = next;
        }
        public ListNode sortList(ListNode head)
        {
            return head == null ? head :mergeSort(head);
        }
        public ListNode mergeSort(ListNode head)
        {
            if(head.next == null)
            {
                return head;
            }
            ListNode p = head,q = head,pre = null;
            while (q !=null  && q.next!=null)
            {
                pre = p;
                p = p.next;
                q = q.next.next;
            }
            pre.next = null;
            ListNode l = mergeSort(head);
            ListNode r = mergeSort(p);
            return merge(l,r);
        }
        ListNode merge(ListNode l,ListNode r)
        {
            ListNode newhead = new ListNode(0);
            ListNode cur = newhead;
            while(l!=null &&r!=null)
            {
                if(l.val<= r.val)
                {
                    cur.next=l;
                    cur = cur.next;
                    l = l.next;
                }
                else
                {
                    cur.next = r;
                    cur = cur.next;
                    r= r.next;
                }
            }
            if(l !=null)
            {
                cur.next = l;
            }
            if(r !=null)
            {
                cur.next = r;
            }
            return newhead.next;
        }
    }
}
