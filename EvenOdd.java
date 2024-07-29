
import java.util.Scanner;
class EvenOdd{

public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("enter a number");
int a = sc.nextInt();
sc.close();
int result = a%2;
if(result==0)
{
System.out.println("NUmber is even");
}
else
{
System.out.println("NUmber is odd");}
}}


