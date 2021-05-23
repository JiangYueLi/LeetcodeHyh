package NC;

import java.util.Stack;

public class NC40 {
    public class ListNode {
    int val;
    ListNode next = null;

        public ListNode(int i) {
            this.val = i;
        }
    }
    public ListNode addInList (ListNode head1, ListNode head2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        ListNode p1 = head1;
        ListNode p2 = head2;
        while (p1 !=null)
        {
            stack1.push(p1.val);
            p1 = p1.next;
        }
        while(p2 != null)
        {
            stack2.push(p2.val);
            p2 = p2.next;
        }
        ListNode head = new ListNode(-1);
        int temp = 0;
        while (!stack1.isEmpty() || !stack2.isEmpty())
        {
            int num1 = stack1.isEmpty()?0:stack1.pop();
            int num2 = stack2.isEmpty()?0:stack2.pop();
            int sum = (num1+num2+temp)%10;
            temp = (num1+num2+temp)/10;
            ListNode next = head.next;
            ListNode node = new ListNode(sum);
            head.next = node;
            node.next = next;
        }
        return head.next;
    }
}
