positive or negative number:

import java.util.*;   
public class a
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int a=sc.nextInt();
        if(a>0)
        {
            System.out.println("Positive Number");
        }
        else if(a<0)
        {
            System.out.println("Negative Number");
        }
        else if(a==0)
        {
            System.out.println("Zero");
        }
    }
}