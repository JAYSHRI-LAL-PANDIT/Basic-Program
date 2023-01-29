public class Factorial_Using_Loop {
    public static void main(String[] args) {
        int num=5,i,fact=1;
        for(i=1; i<=num; i++){
           fact*=i;
        }
        System.out.println("Factorial of "+num+" is : "+fact);
    }
}
