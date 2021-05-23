package LeetCode;

import java.util.HashMap;

public class Leetcode146 {
    class Node{
        public int key,val;
        private Node next,pre;
        public Node(int k,int v)
        {
            this.key = k;
            this.val = v;
        }
    }
    class DoubleList{
        private Node head,tail;
        private int size;
        public void addFist(Node node)
        {
            if(head==null)
            {
                head = tail =node;
            }
            else{
                Node n = head;
                n.pre =node;
                node.next = n;
                head = node;
            }
            size++;
        }

        public void remove(Node node)
        {
            if(head == node && tail==node)
            {
                head = null;
                tail = null;
            }
            else if (tail == node)
            {
                node.pre.next =null;
                tail = node.pre;
            }
            else if (head == node)
            {
                node.next.pre = null;
                head = node.next;
            }
            else
            {
                node.pre.next=node.next;
                node.next.pre=node.pre;
            }
            size--;
        }
        public Node removeLast()
        {
            Node node = tail;
            remove(tail);
            return node;
        }
        public int size()
        {
            return size;
        }
    }


    private HashMap<Integer,Node> map;
    private DoubleList cache;
    private int cap;

    public Leetcode146(int capatity)
    {
        this.cap = capatity;
        map = new HashMap<Integer, Node>();
        cache = new DoubleList();
    }

    public int get(int key)
    {
        if(!map.containsKey(key)) return -1;
        int val = map.get(key).val;
        put(key,val);
        return val;
    }

    public void put(int key,int value)
    {
        Node x = new Node(key,value);
        if(map.containsKey(key))
        {
            cache.remove(map.get(key));
            cache.addFist(x);
            map.put(key,x);
        }
        else
        {
            if(cap == cache.size())
            {
                Node last = cache.removeLast();
                map.remove(last.key);
            }
            cache.addFist(x);
            map.put(key,x);
        }
    }
}
