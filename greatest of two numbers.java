greatest of two numbers:

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
        if(n>m)
        {
            System.out.println("number1 is greater than number2");
        }
        else if(m>n)
        {
            System.out.println("number2 is greater than number1");
        }
        else
        {
            System.out.println("number1 is equal to number2");
        }
    }
}