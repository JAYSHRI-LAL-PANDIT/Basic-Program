//Without using recursion


public class Fibonacci_Series_Without_Recursion {
    
    public static void main(String[] args) 
    {
        int n1=0,n2=1,temp=0,term=10;
        System.out.print(n1+" "+n2);
        for(int i=2; i<=term; i++)
        {
            temp=n1+n2;
            System.out.print(" "+temp);
            n1=n2;
            n2=temp;
            
        }
    }
    
}
