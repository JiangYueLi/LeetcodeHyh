package JZ;

public class JZ25 {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead == null) return null;
        RandomListNode cur = pHead;
        while(cur!=null)
        {
            RandomListNode clone = new RandomListNode(cur.label);
            clone.next = cur.next;
            cur.next =clone;
            cur =clone.next;
        }

        cur = pHead;
        while(cur!=null)
        {
            RandomListNode clone = cur.next;
            if(cur.random!=null)
            clone.random = cur.random.next;
            cur = clone.next;
        }
        cur = pHead;
        RandomListNode pCloneHead = pHead.next;
        while(cur.next!=null)
        {
            RandomListNode node = cur.next;
            cur.next = node.next;
            cur = node;
        }
        return pCloneHead;
    }
}
