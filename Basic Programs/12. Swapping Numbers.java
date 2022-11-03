import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main{
public static void main(String[] args)throws IOException{
BufferedReader BF = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter two numbers : ");
int num1 = Integer.parseInt(BF.readLine());
int num2 = Integer.parseInt(BF.readLine());
int temp;
System.out.println("Before Swapping A="+num1+" and B="+num2);
temp=num1;
num1=num2;
num2=temp;
System.out.println("After Swapping A="+num1+" and B="+num2);
------------------------------------------------------------------------
System.out.println("Swapping without using temp variable...");
System.out.println("Before Swapping A="+num1+" and B="+num2);
num1=num1+num2;
num2=num1-num2;
num1=num1-num2;
System.out.println("After Swapping A="+num1+" and B="+num2);
}
}
