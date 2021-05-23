package JZ;

import java.util.Stack;

public class JZ21 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        int i =0;
        int j = 0;
        for(i = 0;i< pushA.length;i++)
        {
            stack.push(pushA[i]);
            while(!stack.isEmpty()&&stack.peek() == popA[j]){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}
