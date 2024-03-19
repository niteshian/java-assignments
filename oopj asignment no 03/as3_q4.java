import java.util.Scanner; 
class as2_q4
{   
	
       public static void main(String args[])
{
       Scanner sc = new Scanner(System.in);
       System.out.println("enter int num");
       int a = sc.nextInt();
       float b = (float)a;
       double c = (double)a;
       String str = Integer.toString(a);
       char d = (char)a;
       boolean e = (a==0);
       System.out.printf("  int to float: " + b + " int to double: " + c + " int to String: " + str + " int to char: " + d + " int to boolean: " + e );
}
}

