package NC;

public class NC24 {
    public class ListNode {
    int val;
    ListNode next = null;

        public ListNode(int i) {
            this.val =i;
        }
    }
    public ListNode deleteDuplicates (ListNode head) {
        // write code here
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode pre=dummy;
        ListNode p=head;
        while(p!=null&&p.next!=null){
            if(p.val==p.next.val){
                while(p.next!=null&&p.val==p.next.val){
                    p=p.next;
                }
                pre.next=p.next;
                p=p.next;
            }
            else{
                pre=p;
                p=p.next;
            }
        }
        return dummy.next;
    }
}
