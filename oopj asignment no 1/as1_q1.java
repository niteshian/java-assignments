import java.util.Scanner;
public class as1_q1
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter numerical grade");
double b =sc.nextDouble();
String lettergrade =numericalTolettergrade(b);
System.out.println(" Corresponding lettergrade is:" +lettergrade);
sc.close();
}
public static String numericalTolettergrade(double b)
{
if (b>=90)
{
return "A";
}
else if (b>=80)
{
return "B";
}
else if (b>=70)
{
return "c";
}
else if (b>=60)
{
return "D";
}
else if (b>=50)
{
return "E";
}
else
{
return "F";
}
}
}


