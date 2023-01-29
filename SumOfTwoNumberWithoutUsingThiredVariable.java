public class SumOfTwoNumberWithoutUsingThiredVariable {
    public static void main(String[] args) {
        int a=5,b=4;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+" b="+b);
        //Second method 
        int m=5,n=4;
        m=m*n;
        n=m/n;
        m=m/n;
        System.out.println("m= "+m+" n="+n);
    }
}
