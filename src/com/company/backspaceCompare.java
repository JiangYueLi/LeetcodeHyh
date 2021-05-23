package com.company;

import java.util.Stack;

public class backspaceCompare {
    public boolean backspaceCompare(String S,String T)
    {
        if (S.length() == 0 || T.length()==0 || S==null || T ==null)
        {
            return false;
        }
        Stack stackS = new Stack();
        Stack stackT = new Stack();
        for(int i =0;i<S.length();i++)
        {
            if(S.charAt(i) !='#')
            {
                stackS.push(S.charAt(i));
            }
            else
            {
                if(stackS.isEmpty())
                    continue;
                else
                    stackS.pop();
            }
        }
        for(int i =0;i<T.length();i++)
        {
            if(T.charAt(i) !='#')
            {
                stackT.push(T.charAt(i));
            }
            else
            {
                if(stackT.isEmpty())
                    continue;
                else
                    stackT.pop();
            }
        }
        return stackS.equals(stackT)?true:false;
    }
}
