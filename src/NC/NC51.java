package NC;

import java.util.ArrayList;

public class NC51 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        if (lists.size() == 0) return null;
        return mergeKLists(lists, 0, lists.size() - 1);
    }

    public ListNode mergeKLists(ArrayList<ListNode> lists, int low, int high) {
        if (high <= low) return lists.get(low);

        int mid = low + (high - low) / 2;
        ListNode left = mergeKLists(lists, low, mid);
        ListNode right = mergeKLists(lists, mid + 1, high);
        return mergeTwoLists(left, right);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) return l1 == null ? l2 : l1;

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        temp.next = l1 != null ? l1 : l2;
        return dummy.next;

    }
}
