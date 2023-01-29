//Fibonacci Progam with recursion
public class Fibonacci_Series_With_Recursion {
    static int n1=0,n2=1,temp=0;
    public static void fibonacci(int term)
    {
        if(term>0)
        {
            temp=n1+n2;
            System.out.print(" "+temp);
            n1=n2;
            n2=temp;
            fibonacci(term-1);
        }
    }
    public static void main(String[] args) {
        int term=10;
        System.out.print(n1+" "+n2);
        fibonacci(term-2);
    }
}
