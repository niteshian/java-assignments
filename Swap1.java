class Swap1{
public static void display(int First,int Second){
System.out.println("Fisrt Number is :"+First);
System.out.println("Second Number is :"+Second);
}
public static void swap(int First,int Second,int Third)
{
Third=First;
First=Second;
Second=Third;
System.out.println("Fisrt Number after swap is :"+First);
System.out.println("Second Number after swap  is :"+Second);
}
public static void main(String args[])
{
int First = 25;
int Second= 30;
int Third=0;
display(First,Second);
swap(First,Second,Third);
}}

