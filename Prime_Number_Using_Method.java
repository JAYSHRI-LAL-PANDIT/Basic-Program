public class Prime_Number_Using_Method {
    static void prime(int n)
    {
        int m=0,i,flag=0;
        m=n/2;
        if(n==0||n==1)
        {
            System.out.println(n+" is not prime");
        }
        else{
            for(i=2; i<=m; i++){
                if(n%2==0)
                {
                    System.out.println(n+" is not prime");
                    flag=1;
                }
            }
            if(flag==0){
                System.out.println(n+" is prime number");
            }
        }

    }
    public static void main(String[] args) {
        prime(2);
        prime(3);
        prime(4);
        prime(5);
    }
}
