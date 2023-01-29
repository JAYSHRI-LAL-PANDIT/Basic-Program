public class WithoutUsingPlusOperator {
    public static int add(int a, int b)
    {
        for(int i=1; i<=b; i++)
        {
            a++;
        }
        return a;
    }
    public static void main(String[] args) {
        int c=add(4,5);
        System.out.println("sum of two number is :"+c);
    }
}
