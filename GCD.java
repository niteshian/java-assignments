import java.util.Scanner;
class GCD{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("prompt user to enter First number");
int a = sc.nextInt();
System.out.println("prompt user to enter Second  number");
int b = sc.nextInt();
sc.close();
int result = GCD(a,b);
System.out.println(result);
}
public static int GCD(int a,int b)
{
while(b!=0){
int temp = b;
//System.out.println(+b);
b = a%b;
a = temp;
}
return a;}}



