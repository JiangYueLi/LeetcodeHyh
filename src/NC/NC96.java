package NC;

import java.util.Stack;

public class NC96 {
    public class ListNode {
    int val;
    ListNode next = null;
  }
    public boolean isPail (ListNode head) {
        // write code here
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        Stack<Integer> stack = new Stack<>();
        while(slow != null){
            stack.add(slow.val);
            slow = slow.next;
        }

        while(!stack.isEmpty()){
            if(stack.pop() != head.val){
                return false;
            }

            head = head.next;
        }

        return true;
    }
}
