solid rectangle pattern:

import java.util.*;   
public class a
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<m+1;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}