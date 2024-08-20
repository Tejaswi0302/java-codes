swapping of numbers:

import java.util.*;
public class swap
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        m=m+n;
        n=m-n;
        m=m-n;
        System.out.println(m);
         System.out.println(n);
    }
}

import java.util.*;
public class swap
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int temp=m;
        m=n;
        n=temp;
        System.out.println("after swapping:");
        System.out.println(m);
        System.out.println(n);
        
    }
}