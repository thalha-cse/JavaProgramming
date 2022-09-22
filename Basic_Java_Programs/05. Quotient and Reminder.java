// Quotient can be obtained using \ whereas reminder can be obtained using %

import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double quo, rem;
int num1, num2;
System.out.println("Enter two number : ");
num1=sc.nextInt();
num2=sc.nextInt();
quo=num1/num2;
rem=num1%num2;
System.out.println("Result quo : "+quo);
System.out.println("Result rem : "+rem);
}
}
