package JZ;

public class JZ16 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode listk = new ListNode(-1);
        ListNode list = listk.next;
        if(list1==null && list2==null)
            return null;

        while(list1!=null && list2!=null)
        {
            if(list1.val<=list2.val)
            {
                list.next = list1;
                list1 = list1.next;
            }
            else{
                list.next =list2;
                list2 = list2.next;
            }
            list =list.next;
        }
        if(list1==null)
        {
            list.next=list2;
        }
        if(list2 ==null)
        {
            list.next =list1;
        }
        return listk.next;
    }
}
