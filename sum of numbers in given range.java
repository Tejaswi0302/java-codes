sum of numbers in given range:

import java.util.*;   
public class a
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number1:");
        int n=sc.nextInt();
        System.out.print("enter number2:");
        int m=sc.nextInt();
        int sum=0;
        for(int i=n;i<m+1;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum is:"+sum);
    }
}