import java.util.Scanner;
class AdditionDigits{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int N = sc.nextInt();
int b = 0;
while(N>0){
b += N%10;
N/=10;
}
System.out.println("Addition of digits of given Number is :" +b);
}}


