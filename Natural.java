import java.util.Scanner;
class Natural{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int N = sc.nextInt();
sc.close();
for(int n = 1;n<=N; n++){
System.out.print(" "+n);}
}
}
