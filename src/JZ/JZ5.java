package JZ;

import java.util.Stack;

public class JZ5 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int node)
    {
        stack1.push(node);
    }
    public int pop(int node)
    {
        if(stack2.size()<=0)
        {
            while (stack1.size()!=0)
            {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
