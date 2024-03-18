import java.util.Scanner;
class demo
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter year");
int a = sc.nextInt();
int b = 0;
switch(b)
{
case 1:if(a%100==0 && a%400==0)
System.out.println(+ a + "is a leap year");
break;
case 2:if(a%100==0 && a%400>0 )
System.out.println(+ a + "is not a leap year");
break;
case 3: if(a%4==0)
System.out.println(+ a + "is  a leap year");
break;
case 4:
System.out.println(+ a + "is not a leap year");
break;
}
}
}

