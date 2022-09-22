import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num, sum=0;
System.out.println("Enter the number : ");
num = sc.nextInt();
for(int i=1;i<=num;i++){
sum+=i;
}
System.out.println("Sum of Natural Number upto "+num+" is "+sum);
}
}
