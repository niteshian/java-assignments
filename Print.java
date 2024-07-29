import java.util.Scanner;
class Print{
public static void main(String args[])
       {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a number to print its digit");
          int a=sc.nextInt();
          sc.close();
          while(a!=0){
          int b=a%10;//125%10=5;
          System.out.print(" "+b);
          a=a/10;
          }
          }}

       
       
       

        
        
           
