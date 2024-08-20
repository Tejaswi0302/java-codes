greatest of the three numbers:

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
        System.out.print("enter number3:");
        int k=sc.nextInt();
        if(n>m && n>k)
        {
            System.out.println("number1 is greater than number2 and number3");
        }
        else if(m>n && m>k)
        {
            System.out.println("number2 is greater than number1 and number3");
        }
        else
        {
            System.out.println("number3 is greater than number1 and number2");
        }
    }
}