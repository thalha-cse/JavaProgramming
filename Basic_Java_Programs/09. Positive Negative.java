import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbe : ");
int num=sc.nextInt();
if(num==0){System.out.println(num+" is Zero");}
else if(num>=0){System.out.println(num+" is Positive number");}
else{System.out.println(num+" is negative number");}
}
}
