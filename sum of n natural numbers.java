sum of n natural numbers:

import java.util.*;   
public class a
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<n+1;i++)
        {
            sum=sum+i;
        }
         System.out.println("Sum is:"+sum);
        
    }
}