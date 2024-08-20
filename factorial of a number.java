factorial of a number:

import java.util.*;
class a
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int fact=1;
        for(int i=1;i<=m;i++)
        {
            fact=fact*i;
        }
         System.out.println("factorial of "+m+" is :"+fact);
    }
}