public class Factorial_Using_Recursion {
    public static long factorialOfNumber(int number)
    {
        if(number==0)
         return 1;
         else
         return (number*factorialOfNumber(number-1));
    }
    public static void main(String[] args) {
        int number=5;
        long fact=1;
        fact=factorialOfNumber(number);
        System.out.println("Factoral of "+number+" is "+fact);
    }
}
