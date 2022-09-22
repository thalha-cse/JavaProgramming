// Multiply floating numbers using data type called double and size of double is 8 Bytes (64 bit)

import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
float num1, num2;
System.out.println("Enter two floating numbers : ");
num1=sc.nextFloat();
num2=sc.nextFloat();
System.out.println("Result : "+(num1*num2));
}
}
