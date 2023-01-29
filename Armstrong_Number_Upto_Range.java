import java.util.Scanner;
import java.lang.Math;

public class Armstrong_Number_Upto_Range {
     static boolean isArmstrong(int n){
        int sum=0,digits=0,last=0,temp;
         temp=n;
         while(temp>0){
            temp=temp/10;
            digits++;
         }  
         temp=n;
         while(temp>0){
            last=temp%10;
            sum+=(Math.pow(last, digits));
            temp=temp/10;
         }
         if(n==sum) 
            return true;
         else 
            return false;
    }   
         public static void main(String[] args) {
            System.out.print("Enter a limit :");

            Scanner sc= new Scanner(System.in);
            int number=sc.nextInt();
            System.out.println("Armstrong number upto "+number+" are :");
            for(int i=0; i<=number; i++){
                if(isArmstrong(i))
                    System.out.print(i+" ");
            }
         }
}

