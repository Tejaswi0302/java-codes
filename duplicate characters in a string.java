duplicate characters in a string:

import java.util.*;
public class duplicatecharacters
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        String k=sc.next();
        char[] ch=k.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                {
                    System.out.println("duplicate characters are :"+ch[j]);
                    count++;
                }
            }
           
        }
         System.out.println("count of duplicate characters:"+count);
    }
}
