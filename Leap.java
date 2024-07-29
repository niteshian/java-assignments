import java.util.Scanner;
class Leap{
public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
          System.out.println("Enter a number to be check");
          int a = sc.nextInt();
          if ((a%4==0 && a%100!=0 ) || a%400==0 )
          System.out.println("Enter year is Leap year");
          else
          System.out.println("Enter Year is Not Leap year");
}}

          