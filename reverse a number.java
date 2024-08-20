reverse a number:

import java.util.*;
class reverse
{
    public static void main(String[] args)
    {
        Scanner m=new Scanner(System.in);
        int k=m.nextInt();
        int sum=0;
        while(k>0)
        {
            int l=k%10;
            sum=(sum*10)+l;
            k=k/10;
        }
        System.out.println("reversed number is:"+sum);
    }
}