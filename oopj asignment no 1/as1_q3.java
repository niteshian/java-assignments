import java.util.Scanner; 
class as1_q3
{
public static void main(String args[])
{
float result = 0.f;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number1");
int a = sc.nextInt();
System.out.println("Enter a number2");
int b = sc.nextInt();
System.out.println("Enter operation to perform");
int c = sc.nextInt();
if (c>=5)
{
System.out.println("No operation");
}
else
{
switch(c)
{
case 1:result = a*b;
System.out.println("multiplication of entered number is:" +result);
break;
case 2:result = a+b;
System.out.println("addotion of entered number is:" +result);
break;
case 3:result = a-b;
System.out.println("subtraction of entered number is:" +result);
break;
case 4:if (b!=0)
{
result = a/b;
System.out.println("Division of entered number is:" +result);
}
else if ( b==0)
{
System.out.println("Division of entered number is:infinity");
}
else
{
break;
}
}
}
}
}




