import java.util.*;
public class Prime {
    public static void main(String args[])
    {
        Scanner in = new Scanner (System.in);
        int n, count=0;
        System.out.print("Enter a number : ");
        n=in.nextInt();
        for(int i=1; i<=n; i++)
        {
        if(n%i==0)
        count++;
        }
        if(count==2)
        System.out.println("The number is a Prime Number!");
        else
        System.out.println("The number is not a Prime Number!");
        
    }
}
