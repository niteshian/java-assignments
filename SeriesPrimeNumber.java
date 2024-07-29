import java.util.Scanner;
class SeriesPrimeNumber{
public static void main(String args[])
       {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int number = sc.nextInt();
       for(int n=1;n<=number;n++){
       if(IsPrime(n))
       System.out.print(" "+n);}}
       public static boolean IsPrime(int number){
       if(number==1)
       return false;
       if(number==2)
       return true;
       if(number%2==0)
       return false;
       for(int i = 3;i<=Math.sqrt(number);i+=2){
       if(number%i==0)
       return false;}
       return true;
       }
      
}
