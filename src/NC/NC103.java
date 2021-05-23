package NC;

import java.util.Stack;

public class NC103 {
    public String solve (String str) {
        // write code here
        StringBuffer sb = new StringBuffer();
        for(int i = str.length()-1;i>=0;i--)
        {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
