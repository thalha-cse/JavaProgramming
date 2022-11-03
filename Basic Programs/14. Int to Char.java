import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class int_char{
public static void main(String[] args)throws IOException{
BufferedReader BF = new BufferedReader(new InputStreamReader(System.in));
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers : ");
int num1=Integer.parseInt(BF.readLine());
char a=(char) num1;
System.out.println("Value of integer is : "+num1);
System.out.println("Converted from integer to character : "+a);
-------------------------------------------------------------------------
System.out.println("Enter two numbers : ");
int num2=sc.nextInt();
char b=(char) num2;
System.out.println("Value of Integer is : "+num2);
System.out.println("Converted from integer to character : "+b);
}
}
