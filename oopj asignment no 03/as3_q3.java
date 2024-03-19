import java.util.Scanner; 
class as2_q3
{   
	
       public static void main(String args[])
{
       Scanner sc = new Scanner(System.in);
       System.out.println("enter int num");
       int a = sc.nextInt();
       float b = (float)a;
       double c = (double)a;
       String str = Integer.toString(a);
       int f = Integer.parseInt(str);
       char d = (char)a;
       boolean e = (a==0);
       float r1 = a+b;
       double r2 = c-b;
       System.out.println("int to float: " + b + " int to double: " + c + " int to String: " + str + " int to char: " + d + " int to boolean:" + e );
       System.out.printf("String to int:" + f +  " show r1:" + r1 + " show r2:" + r2 );
}
}

