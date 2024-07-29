import java.util.Scanner;
class RecursionFactorial{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("enter a number");
int a= sc.nextInt();
int result=Factorial(a);
System.out.println("Factorial of "+a+" is :"+result);
}
public static int Factorial(int a)
{
if (a==0)
return 1;
else
return a*Factorial(a-1);
}}


