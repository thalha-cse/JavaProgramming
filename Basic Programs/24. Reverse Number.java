import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number : ");
int num = sc.nextInt();
int reversed = 0;
while(num!=0){
int rem = num%10;
reversed = reversed * 10 + rem;
num = num/10;
}
System.out.println("Result : "+reversed);
}
}
