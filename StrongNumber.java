import java.util.Scanner;
public class StrongNumber {
    public static long f(int n)
    {
        int fact=1;
        for(int i=1; i<=n; i++)
        {
           fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int number=sc.nextInt();
        int n,rem,sum=0;
        n=number;
        while(n!=0)
        {
            rem=n%10;
            sum+=f(rem);
            n=n/10;
        }
        if(sum==number)
          System.out.println(number+" is strong number");
        else
          System.out.println(number+" is not strong");
    }
}
