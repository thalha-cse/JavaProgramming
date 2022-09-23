import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n1=0, n2=1, n3;
System.out.println("Enter the number : ");
int num=sc.nextInt();
System.out.println("Fibonacci Series....");
for(int i=1;i<=num;i++){
System.out.print(n1+", ");
n3=n1+n2;
n1=n2;
n2=n3;
}
}
}
