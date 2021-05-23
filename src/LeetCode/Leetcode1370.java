package LeetCode;

public class Leetcode1370 {
    public String sortString(String s) {
        int []recode = new int [26];
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<s.length();i++)
        {
            recode[s.charAt(i)-'a']++;
        }
        int n = s.length();
        while(n>0)
        {
            for(int i =0;i<26;i++)
            {
                if(recode[i]!=0)
                {
                    recode[i]--;
                    n--;
                    sb.append((char)(i+'a'));
                }
            }
            for(int i = 25; i>=0 ;i--) {
                if(recode[i]!=0) {
                    sb.append((char)('a' + i));
                    recode[i]--;
                    n--;
                }
            }
        }
        return sb.toString();
    }
}
