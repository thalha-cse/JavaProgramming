import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int num1, num2, flag=0;
System.out.println("Enter the lower limit : ");
num1 = sc.nextInt();
System.out.println("Enter the upper limit : ");
num2 = sc.nextInt();
System.out.println("The prime numbers in between the range are : ");
for(int i=num1;i<=num2;i++){
for(int j=2;j<i;j++){
if(i%j==0){
flag=0;
break;
}
else{
flag=1;
}
}
if(flag==1){System.out.println(i);}
}
}
}
