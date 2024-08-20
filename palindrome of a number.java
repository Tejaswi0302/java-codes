palindrome:

import java.util.*;
class palindrome
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int sum=0;
        int temp=m;
        while(m>0)
        {
            int a=m%10;
            sum=(sum*10)+a;
            m=m/10;
        }
        if(temp==sum)
        {
            System.out.println("it is a palindrome");
        }
        else
        {
            System.out.println("it is  not a palindrome");
        }
    }
}