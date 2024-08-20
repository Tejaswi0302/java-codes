reverse a string:

import java.util.*;
class reverseastrig
{
    public static void main(String[] args)
    {
        Scanner m=new Scanner(System.in);
        String k=m.nextLine();
        String rev="";
        int len=k.length();
       for(int i=len-1;i>=0;i--)
       {
           rev=rev+k.charAt(i);
       }
        System.out.println("reversed string is:"+rev);
    }
}