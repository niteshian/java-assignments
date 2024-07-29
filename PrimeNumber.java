import java.util.Scanner;
class PrimeNumber{
public static void main(String args[])
       {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int number = sc.nextInt();
       if(IsPrime(number))
       System.out.println("Enter number is prime");
       else
       System.out.println("Enter number is Not Prime");
       }
       public static boolean IsPrime(int number){
       if(number==1)
       return false;
       if(number==2)
       return false;
       if(number%2==0)
       return false;

       
       for(int i = 3;i<Math.sqrt(number);i+=2){
       if(number%i==0)
       return false;}
       return true;
       }}