import java.util.Scanner;
class Swap2{
public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter First number to swap");
          int a = sc.nextInt();
          System.out.println("Enter Second number to swap");
          int b = sc.nextInt();
          sc.close();
          a = a * b;
          b= a/b;
          a = a/b;
          System.out.println("First number after swap is: " +a);
          System.out.println("Second number after swap is: " +b);}}