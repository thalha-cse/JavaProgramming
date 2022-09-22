import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number : ");
int num=sc.nextInt();
for(int i=1;i<=num;i++){
System.out.println(num+" * "+i+" = "+num*i);
}
}
}
