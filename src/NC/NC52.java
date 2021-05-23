package NC;

import java.util.Stack;

public class NC52 {
    public boolean isValid (String s) {
        // write code here
        if(s.length() %2 !=0) return false;
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<s.length();i++)
        {
            if(stack.isEmpty())
            {
                stack.add(s.charAt(i));
            }
            else if (s.charAt(i) == stack.peek()){
                    stack.add(s.charAt(i));

            }
            else
            {
                if (s.charAt(i) == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (s.charAt(i) == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (s.charAt(i) == ']' && stack.peek() == '[') {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
