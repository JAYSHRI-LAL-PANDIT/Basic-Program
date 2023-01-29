public class Palindrome_Number {
    public static void main(String[] args) {
        int n,num=121,rem=0,sum=0;
        n=num;
        while(num>0)
        {
            rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
        }
        if(n==sum)
          System.out.println(n+" is palindrome number.");
        else
          System.out.println(n+" is not palindrome number.");  
        
        
    }
}
