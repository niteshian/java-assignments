import java.util.Scanner;
class as1_q4
{

public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number 1 to 7");
	int a = sc.nextInt();
//sc.close();
	String Day = numtodayconvert(a);
	System.out.println("day is:" + Day);
}

public static String numtodayconvert(int a)
{
switch(a)
{
case 1: 
	return "Monday";


case 2:
	return "Tuesday";

case 3:
	return "wednessday";
	
case 4:
	return "Thursday";

case 5:
	return "Friday";
	
case 6:
	return "Saturday";

case 7:
	return "Sunday";
	
default:
	return "not valid";
}
}
}
 