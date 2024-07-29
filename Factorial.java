import java.util.Scanner;
class Factorial{

public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("enter a number");
int a= sc.nextInt();
int result=1;
for(int n=a;n>0;n--)
{
result=result*n;
}
System.out.println("factorial of " +a+" is:" +result);
sc.close();
}
}


