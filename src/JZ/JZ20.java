package JZ;

import java.util.Stack;

public class JZ20 {
    Stack<Integer> stack=new Stack<Integer>();
    Stack<Integer> stack2=new Stack<Integer>();
    public void push(int node)
    {
        stack.push(node);
        if(stack2.isEmpty())
        {
            stack2.push(node);
        }
        else if(node <= stack2.peek())
        {
            stack2.push(node);
        }
    }
    public void pop()
    {
        if(stack.peek()<=stack2.peek())
        {
            stack2.pop();
        }
        stack.pop();
    }

    public int  top(){
        return stack.peek();
    }
    public int min(){
        return stack2.peek();
    }
}
