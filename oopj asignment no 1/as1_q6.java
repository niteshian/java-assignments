import java.util.Scanner;
class as1_q6
{
public static void main(String args[])
{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter persons weight in kg");
      double weight = sc.nextFloat();
      System.out.println("Enter persons Height in meter");
      double height = sc.nextFloat();
      double BMI = weight/height*height;
      System.out.println(+BMI);
}
}

