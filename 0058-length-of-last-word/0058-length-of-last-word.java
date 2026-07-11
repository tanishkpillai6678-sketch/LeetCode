class Solution 
{
    public int lengthOfLastWord(String s) 
    {
        int n=0;
        s = s.trim();
        for(int i=s.length()-1;i>=0;i--)
        {
           char ch=s.charAt(i);
           if(ch==' ')
           {
            n=n+i;
            break;
           }
        }
        if(n==0)
        {
            return s.length();
        }
        String name=s.substring(n+1, s.length());
        int len=name.length();
        return len;
    }
}