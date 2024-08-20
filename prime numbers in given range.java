prime numbers in given range:

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
        System.out.print("enter range:");
        int k=sc.nextInt();
        for(n=0;n<k+1;n++)
        {
        if(n==0 || n==1 || n%m==0)
        {
            System.out.println(n+" is not a prime number");
        }
        else if(n%2!=0 && n%m!=0)
        {
            System.out.println(n+" is a prime number");
        }
        }
    }
}