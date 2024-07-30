class Largest{
public static void main(String args[]){
int a = 34;
int b = 29;
int c = 45;
int temp;
temp = a;
if(temp<b)
temp = b;
if(temp<c)
temp=c;
System.out.println("Largest number among"+" 34 " + " 29 " + " 45 " + "numbers is :" +temp);
}}