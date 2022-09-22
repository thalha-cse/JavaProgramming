// Addition of given integer using Scanner class and it has a method called nextInt()

import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter two numbers : ");
int num1=sc.nextInt();
int num2=sc.nextInt();
System.out.println("Result : "+(num1+num2));
}
}
